package artemisTesting;

import static org.junit.Assert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import artemisLite.Element;
import artemisLite.ElementName;
import artemisLite.ElementType;

class ElementTest {

	// test data
	int squareNumberValid;
	int squareNumberInvalid;

	int rentValid;
	int rentInvalid;

	int levelValid;
	int levelInvalid;

	boolean minorDevelopmentValid, minorDevelopmentInvalid, majorDevelopmentValid, majorDevelopmentInvalid;

	Element element;

	@BeforeEach
	void setUp() throws Exception {

		squareNumberValid = 7;
		squareNumberInvalid = 15;

		rentValid = 125;
		rentInvalid = 251;

		levelValid = 2;
		levelInvalid = 4;

		minorDevelopmentValid = true;
		minorDevelopmentInvalid = false;

		majorDevelopmentValid = true;
		majorDevelopmentInvalid = false;

		element = new Element();

	}

	@Test
	void testElementDefaultConst() {
		assertNotNull(element);
	}

	@Test
	void testElementConstWithArgs() {
		Element element = new Element(squareNumberValid, ElementName.BOOSTERS, ElementType.ORION, rentValid);
		assertEquals(squareNumberValid, element.getSquareNumber());
		assertEquals("BOOSTERS", element.getElementName().toString());
		assertEquals("ORION", element.getElementType().toString());
		assertEquals(rentValid, element.getRent());
	}

	@Test
	void testGetSetSquareNumberValid() {
		element.setSquareNumber(squareNumberValid);
		assertEquals(squareNumberValid, element.getSquareNumber());
	}

	@Test
	void testGetSetSquareNumberInvalid() {
		element.setSquareNumber(squareNumberInvalid);
		assertEquals(squareNumberInvalid, element.getSquareNumber());
	}

	@Test
	void testGetSetMajorDevelopmentValid() {
		element.setMajorDevelopment(majorDevelopmentValid);
		assertEquals(majorDevelopmentValid, true);

	}

	@Test
	void testGetSetMajorDevelopmentInvalid() {
		element.setMajorDevelopment(majorDevelopmentInvalid);
		assertEquals(majorDevelopmentInvalid, false);

	}

	@Test
	void testGetSetMinorDevelopmentValid() {
		element.setMinorDevelopment(minorDevelopmentValid);
		assertEquals(minorDevelopmentValid, true);
	}

	@Test
	void testGetSetMinorDevelopmentInvalid() {
		element.setMinorDevelopment(minorDevelopmentInvalid);
		assertEquals(minorDevelopmentInvalid, false);

	}

	@Test
	void testGetSetRentValid() {
		element.setRent(rentValid);
		assertEquals(rentValid, element.getRent());

	}

	@Test
	void testGetSetRentInvalid() {
		element.setRent(rentInvalid);
		assertEquals(rentInvalid, element.getRent());

	}

	@Test
	void testGetSetLevelValid() {
		element.setLevel(levelValid);
		assertEquals(levelValid, element.getLevel());

	}

	@Test
	void testGetSetLevelinValid() {
		element.setLevel(levelInvalid);
		assertEquals(levelInvalid, element.getLevel());

	}

}