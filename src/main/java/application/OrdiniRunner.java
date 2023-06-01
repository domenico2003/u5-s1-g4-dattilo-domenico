package application;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import application.orders.Ordine;
import application.orders.OrdineStatus;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Order(1)
public class OrdiniRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = Application.context();
		// Ordine ordine = createOrdine(ctx, 6, OrdineStatus.pronto);
//		ordine.addOrdine(new ElementoOrdine((Consumazione) ctx.getBean("margherita"), "test1"));
//		ordine.addOrdine(new ElementoOrdine((Consumazione) ctx.getBean("acqua"), "test2"));
//		salvaOrdine(ctx, ordine);
//		log.info(ordine.toString());

		Scanner scan = new Scanner(System.in);
		int enter = -1;
		while (enter != 0) {
			System.out.println("scegli l'opzione");
			System.out.println();
			System.out.println("0. esci");
			System.out.println("1. crea ordine");
			System.out.println("2. leggi tutte le ordinazioni");

			enter = scan.nextInt();
			scan.nextLine();
			switch (enter) {
			case 1:

				break;

			case 2:

				break;
			}

		}
		scan.close();
	}

	public static Ordine createOrdine(AnnotationConfigApplicationContext ctx, int coperti, OrdineStatus stato) {
		Ordine o1 = ctx.getBean(Ordine.class);
		o1.setNumeroCoperti(coperti);
		o1.init();
		o1.setStato(stato);

		return o1;
	}

}