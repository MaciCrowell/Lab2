package com.mobileproto.lab2;

/**
 * Created by mingram on 9/16/13.
 */
public class Note {

    //private variables
    int _id;
    String _noteName;
    String _noteText;

    // Empty constructor
    public Note(){

    }
    // constructor
    public Note(int id, String noteName, String noteText){
        this._id = id;
        this._noteName = noteName;
        this._noteText = noteText;
    }

    // constructor
    public Note(String noteName, String noteText){
        this._noteName = noteName;
        this._noteText = noteText;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._noteName;
    }

    // setting name
    public void setName(String name){
        this._noteName = name;
    }

    // getting phone number
    public String getNoteText(){
        return this._noteText;
    }

    // setting phone number
    public void setNoteText(String noteText){
        this._noteText = noteText;
    }
}
