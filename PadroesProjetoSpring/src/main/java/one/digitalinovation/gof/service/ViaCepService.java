package one.digitalinovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinovation.gof.model.Endereco;

/**
 * Client HTTP, criado via <b>OpenFeing</b>, para o consumo da API
 * <b>viaCEP</b>
 * 
 * @author Maite
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
