package es.raulete.demo.sqlite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.raulete.demo.sqlite.entities.Item;
import es.raulete.demo.sqlite.services.ItemsService;

@SpringBootApplication
public class SqliteApplication implements CommandLineRunner{

	@Autowired
	private ItemsService itemsService;

	public static void main(String[] args) {
		SpringApplication.run(SqliteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
		showItems();
	}

	private void showItems(){
		for (Item item : itemsService.findAll()) {
			System.out.println(item.getName());
		}
	}

}
