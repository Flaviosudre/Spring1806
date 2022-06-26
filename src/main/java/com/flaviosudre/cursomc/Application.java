package com.flaviosudre.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flaviosudre.cursomc.domain.Categoria;
import com.flaviosudre.cursomc.domain.Cidade;
import com.flaviosudre.cursomc.domain.Cliente;
import com.flaviosudre.cursomc.domain.Endereco;
import com.flaviosudre.cursomc.domain.Estado;
import com.flaviosudre.cursomc.domain.Produto;
import com.flaviosudre.cursomc.domain.enums.TipoCliente;
import com.flaviosudre.cursomc.repository.CategoriaRepository;
import com.flaviosudre.cursomc.repository.CidadeRepository;
import com.flaviosudre.cursomc.repository.ClienteRepository;
import com.flaviosudre.cursomc.repository.EnderecoRepository;
import com.flaviosudre.cursomc.repository.EstadoRepository;
import com.flaviosudre.cursomc.repository.ProdutoRepository;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria("Informatica");
		Categoria cat2 = new Categoria("Escritorio");
		Categoria cat3 = new Categoria("Estoque");
		
		Produto p1 = new Produto("Computador",2000.00);
		Produto p2 = new Produto("Impressora",820.00);
		Produto p3 = new Produto("Mouse",50.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));


		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null,"São Paulo");
		
		Cidade cid1 = new Cidade(null,"Uberlandia",est1);
		Cidade cid2 = new Cidade(null,"São Paulo",est2);
		Cidade cid3 = new Cidade(null,"Campinas",est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2,cid3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3));
		
		Cliente cli1 = new Cliente("Maria da Silca", "mariasilva@gmail.com", "01302711792", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("273630033","982916625"));
		
		Endereco e1 = new Endereco(null,"Rua Flores", "300","Apto 201","Jardim", "87175544", cli1, cid1);
		Endereco e2 = new Endereco(null,"Avenida Matos", "450","Apto 201","Centro", "982819965", cli1, cid2);
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
		
		
	}
}
