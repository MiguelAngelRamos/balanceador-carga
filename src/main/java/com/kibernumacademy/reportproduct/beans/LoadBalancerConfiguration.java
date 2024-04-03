package com.kibernumacademy.reportproduct.beans;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;


@Slf4j // Anotación de Lombok que provee automáticamente un objeto logger llamado 'log'.
public class LoadBalancerConfiguration { // Define la clase LoadBalancerConfiguration que configura el balanceador de carga.

  // Método que configura cómo el balanceador de carga obtiene las instancias de servicio disponibles.
  public ServiceInstanceListSupplier serviceInstanceListSupplier(ConfigurableApplicationContext context) {
    log.info("Configuring load balancer"); // Registra en el log que se está configurando el balanceador de carga.
    // Crea y configura una instancia de ServiceInstanceListSupplier usando un patrón builder.
    return ServiceInstanceListSupplier.builder()
            .withBlockingDiscoveryClient() // Utiliza un cliente de descubrimiento que bloquea hasta que la operación de descubrimiento está completa.
            //.withSameInstancePreference() // (Comentado) Preferiría instancias del mismo servicio que ya se han usado previamente, si estuviera descomentado.
            .build(context); // Construye la instancia de ServiceInstanceListSupplier con el contexto de la aplicación proporcionado.
  }
}

//  Esta clase configura cómo el balanceador de carga selecciona la instancia de servicio a la que se debe enviar una solicitud.
//proveedora es Supplier
