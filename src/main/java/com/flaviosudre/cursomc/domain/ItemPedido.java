package com.flaviosudre.cursomc.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemPedido {
	
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	public ItemPedido() {
	}
	public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer
					  quantidade, Double preco) {
	super();
	//id.setPedido(pedido);
	//id.setProduto(produto);
	this.desconto = desconto;
	this.quantidade = quantidade;
	this.preco = preco;
	}
}
