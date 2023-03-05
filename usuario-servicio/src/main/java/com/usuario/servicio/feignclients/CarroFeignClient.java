package com.usuario.servicio.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;


import com.usuario.servicio.modelos.Carro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "carro-service")
public interface CarroFeignClient {
	
	@PostMapping("/carro")
	public Carro save(@RequestBody Carro carro);
	
	@GetMapping("/carro/usuario/{usuarioId}")
	public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);

}
