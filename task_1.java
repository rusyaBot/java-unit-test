@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Проверка пользователя на 18 лет",true,isAdult); // Напиши код здесь
}