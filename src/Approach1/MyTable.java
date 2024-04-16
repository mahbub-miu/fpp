package src.Approach1;

public class MyTable{
    Entry[] entries;
    MyTable(){
        entries=new Entry[26];
    }

    public void add(char c, String s){
        checkValidInput(c);
        int index=c-'a';
        if(entries[index]==null){
            entries[index]=new Entry(c,s);
        }
        else {
            entries[index].setS(s);
        }
    }

    public String get(char c){
        int index=c-'a';
        if(entries[index]!=null){
            return entries[index].toString();
        }
        else return "No match found for : "+c;
    }

    public void checkValidInput(char c){
        int charValue=(int) c;
        if (charValue<97||charValue>122){
            System.out.println("You inputted : "+c+" This is not valid input");
            System.out.println("Please input character between a to z. Program is terminating. Try again");
            System.exit(0);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(Entry entry:entries){
            if (entry !=null ) {
                sb.append(entry.toString()+"\n");
            }
        }
        return sb.toString();
    }

    public class Entry{
        char c;
        String s;
        Entry(char c, String s){
            checkValidInput(c);
            this.c=c;
            this.s=s;
        }

        public char getC(){return c;}
        public void setC(char c){
            checkValidInput(c);
            this.c=c;
        }

        public String  getS(){return s;}
        public void setS(String s){this.s=s;}

        @Override
        public String toString(){
            return getC()+" -> "+getS();
        }
    }
}