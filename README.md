# AnalyzeVerbs
 This Java application was done as a part of CS 102 course in 2022, it processes input text documents, identifies verbs and extracts their tense and person by matching tokens against a dictionary of English verb forms. 
 It also counts the appearence frequences of the verbs by looking through the input texts.
 App.java: handles the entire flow from loading the english verb dictionary to going through the input files.
Verb.java: has the specific attributes of an English verb, allowing the program to distinguish between different forms of the same base word.
VerbDictionary.java: Acts as a lookup table managing thousands of verb entries for quick comparison during document parsing.
InputDocument.java: Handles the logic for scanning raw text and preparing it for verification.
