package com.gateway.gateway.modules.pagseguro.Application.Component;

import org.springframework.stereotype.Component;

import com.gateway.gateway.modules.pagseguro.Application.Dtos.PhoneDTO;

import br.com.uol.pagseguro.api.common.domain.builder.PhoneBuilder;

@Component
public class PhoneComponent {
	
	public PhoneBuilder toPhoneBuilder(PhoneDTO telefone) {
		return new PhoneBuilder()
				.withAreaCode(telefone.getCodeArea())
				.withNumber(telefone.getNumber());
	}
}
