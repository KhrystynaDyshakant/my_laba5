package ua.lviv.iot.algo.part1.lab1;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    @Test
    public void testRemove() {
        Text text = new Text("Computer science", "s");
        assertEquals("science", text.getWordsFromText());
    }
    @Test
    public void testTextForTheReturnSecondWords(){
        Text text=new Text("Hello word","w");
        assertEquals("word",text.getWordsFromText());
    }
        @Test
        public void testGetWordsFromText() {
            Text text = new Text("Hey everyone", "e");
            assertEquals("everyone", text.getWordsFromText());

        }

}



