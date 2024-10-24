//this class will be the place where all the content of questions is actually held


public class Question {

    private String question;
    private String one;
    private String two;
    private String three;
    private String four;
    private String correctAnswer;
 

    public Question(String type, String genre, int level){

        if (level == 1){
            if(type.equals("V")){
                if (genre.equals("E")){
                    vocabEducationOne();
                }
            }
        }

    }

    public String[] getInfo() {

        //multiple choice template
        String[] toReturn = {question, one, two, three, four, correctAnswer};

        return toReturn;

    }

    public void vocabEducationOne (){
        int pickQuestion = (int)(Math.random()*10); // we can fix so questions arent repeated later

        //multiple choice
        if(pickQuestion == 0){
            //question content; this is where all the questions and possible responses acutally go
            question = "Which one is Book in English";
            one = "Cat";
            two = "House";
            three = "Book";
            four = "Boy";
            correctAnswer = "Book"; //type in the correct option but its numerical value
            
        }
        else if(pickQuestion == 1){
            question = "Which one is Pencil in English";
            one = "Girl";
            two = "Pencil";
            three = "Door";
            four = "Boy";
            correctAnswer = "Pencil";
            
        }
        else if(pickQuestion == 2){
            question = "In my free time, I love to play the ___";
            one = "Soccer";
            two = "Guitar";
            three = "Basketball";
            four = "Orchestra";
            correctAnswer = "Guitar";
          
        }
        else if(pickQuestion == 3){
            question = "The weather is quite ___ in winter here. ";
            one = "Hot";
            two = "Cold";
            three = "Warm";
            four = "Careful";
            correctAnswer = "Cold";
           
        }
        else if(pickQuestion == 4){
            question = "I live ___ New York City";
            one = "On";
            two = "In";
            three = "About";
            four = "With";
            correctAnswer = "In";
           
        }
        else if (pickQuestion == 5){
            //whenever there is a image recognition question we will just put the filename as the string for the image
            question = "img/mountain.png";
            one = "Mountain";
            two = "Hill";
            three = "Lake";
            four = "Forest";
            correctAnswer = "Mountain";
          
        }
        else if (pickQuestion == 6){
            question = "img/lake.png";
            one = "Sky";
            two = "Mound";
            three = "Tree";
            four = "Lake";
            correctAnswer = "Lake";
        }
        else if (pickQuestion == 7){
            question = "img/sky.png";
            one = "Comet";
            two = "Water";
            three = "Rain";
            four = "Sky";
            correctAnswer = "Sky";
        }
        else if (pickQuestion == 8){
            //synonmy swap
            question = "I cant wait for school to \"start\" again";
            one = "End";
            two = "Become";
            three = "Begin";
            four = "Be";
            correctAnswer = "Begin";
        }
        else if (pickQuestion == 9){
            //synonmy swap
            question = "I just came back from Chicago, it was \"amazing\"";
            one = "Affectionate";
            two = "Incredible";
            three = "Absurd";
            four = "Quick";
            correctAnswer = "Incredible";
        }
    }

}

