package com.it_academy.parsers.dom;

import com.it_academy.entity.Journal;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import static com.it_academy.entity.Journal.setJournalWithXMLNodeValues;
import static com.it_academy.parsers.dom.DomParserUtils.parseXmlDocument;

public class DOMParserDemo {
    private static final String XML_PATH = "journal.xml";
    public static Journal journal = new Journal();

    public static void main(String[] args) {
        Document document = parseXmlDocument(XML_PATH);
        NodeList nodeList = DomParserUtils.getNodeList(document);
        journal = setJournalWithXMLNodeValues(nodeList);
        System.out.println(journal.toString());
    }
}


