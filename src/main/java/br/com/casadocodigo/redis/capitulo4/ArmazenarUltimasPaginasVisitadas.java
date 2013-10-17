package br.com.casadocodigo.redis.capitulo4;

import redis.clients.jedis.Jedis;

public class ArmazenarUltimasPaginasVisitadas {
 
	public static void main(String[] args) {
		String chave = "ultimas_paginas_visitadas";
		String[] paginasVisitadas = {
			"/",
			"/contato",
			"/sobre-mim",
			"/todos-os-posts",
			"/armazenando-dados-no-redis"
		};

		Jedis jedis = new Jedis("localhost");
		Long resultado = jedis.lpush(chave, paginasVisitadas);

		System.out.println(
			String.format(
				"A lista %s contém %d elementos", chave, resultado
			)
		);
	}

}