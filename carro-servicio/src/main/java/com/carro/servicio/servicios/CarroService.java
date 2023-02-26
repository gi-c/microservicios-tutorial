package com.carro.servicio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.servicio.entidades.Carro;
import com.carro.servicio.repositorio.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	
	public List<Carro> getAll(){
		return carroRepository.findAll();
	}
	
	public Carro getCarroById(int id) {
		return carroRepository.findById(id).orElse(null);
	}
	
	public Carro save(Carro carro){
		Carro newCarro = carroRepository.save(carro);
		return newCarro;
	}
	
	public List<Carro> getUsuarioById(int usuarioId){
		return carroRepository.findByUsuarioId(usuarioId);
	}
}
