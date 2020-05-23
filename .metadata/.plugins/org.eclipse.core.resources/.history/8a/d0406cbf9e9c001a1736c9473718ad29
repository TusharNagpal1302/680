package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;

class StockQuoteObservableTest {

	@Test
	void checkDijaQuote() {
		PiechartObserver PiechartObserver = new PiechartObserver();
		TableObserver TableObserver = new TableObserver();
		ThreeDObserver THREEDObserver = new ThreeDObserver();

		StockQuoteObservable djiaObserver = new StockQuoteObservable();
		djiaObserver.addObserver(PiechartObserver);
		djiaObserver.addObserver(TableObserver);
		djiaObserver.addObserver(THREEDObserver);

		djiaObserver.changeQuote("ABC",15);
		djiaObserver.changeQuote("XYZ",30);
	}

}
