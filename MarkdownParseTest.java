import static org.junit.Assert.*;

import java.nio.file.*;
import java.util.*;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void snippet1test1() throws Exception{
    String[] expected = {"`google.com"};

    ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("/Users/Jaden/Documents/GitHub/markdown-parser/snippet1.md")));
    
    assertArrayEquals(expected, links.toArray());
    }

    @Test
    public void snippet1test2() throws Exception{
    String[] expected = {"a.com","a.com(())","example.com"};

    ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("/Users/Jaden/Documents/GitHub/markdown-parser/snippet2.md")));
    
    assertArrayEquals(expected, links.toArray());
    }


    @Test
    public void snippet1test3() throws Exception{
    String[] expected = {"https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"};

    ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("/Users/Jaden/Documents/GitHub/markdown-parser/snippet3.md")));
    
    assertArrayEquals(expected, links.toArray());
    }
}
