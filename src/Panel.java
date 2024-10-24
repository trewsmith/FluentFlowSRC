import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;

public class Panel {

    // create the program files and the hander
    private FileController FC = new FileController();

    // make the things for questions global so that they don't break
    String questionInfo[];
    String correctAns;

    JFrame frame = new JFrame("Fluent Flow");
    JLabel labelsArray [] = new JLabel[11];
    JButton buttonsArray [] = new JButton[24];

    
    //title screen
    JLabel title = new JLabel();
    JButton login = new JButton();
    ImageIcon appNameIcon = new ImageIcon("img/appName.png");
        //background for app
    JLabel backGround = new JLabel();
    ImageIcon backGroundImg = new ImageIcon("img/background.png");

   //home page
   JButton menu = new JButton();
   JButton vocab = new JButton();
   JButton grammer = new JButton();
   JButton returnButton = new JButton();

   //menu options
   JButton account = new JButton();
   JButton visual = new JButton();
   JButton about = new JButton();

    //about
    JLabel aboutText = new JLabel();
    //visual
    JButton lightModeButton = new JButton();
    JButton darkModeButton = new JButton();
    //account
    JLabel completionLabel = new JLabel();
    JLabel usernameLabel = new JLabel();

    //mulitple choice
    JLabel questionTitle = new JLabel();
    JButton optionOne = new JButton();
    JButton optionTwo = new JButton();
    JButton optionThree = new JButton();
    JButton optionFour = new JButton();
    JLabel finalScore = new JLabel();
    ImageIcon imageRecognitionMC ;
    

    //subjects : 

   //vocabulary ; the lessons withing a subject
   JButton travel = new JButton();
   JButton shopping = new JButton();
   JButton education = new JButton(); 

    //lesson creater
    Lesson currentLesson; 
    
   //grammer
    JButton verbs = new JButton();
    JButton punctuation = new JButton();

    public void buttonActions(){
        
        //title screen
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                login.setEnabled(false);
                login.setVisible(false);

                title.setVisible(false);

                menu.setEnabled(true);
                menu.setVisible(true);
                
                vocab.setEnabled(true);
                vocab.setVisible(true);

                grammer.setEnabled(true);
                grammer.setVisible(true);
            }
        });

        //home page
        menu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(about.isEnabled() == false){
                    menu.setText("Return");

                    vocab.setEnabled(false);
                    vocab.setVisible(false);
    
                    grammer.setEnabled(false);
                    grammer.setVisible(false);

                    about.setEnabled(true);
                    about.setVisible(true);
                    
                    account.setEnabled(true);
                    account.setVisible(true);
    
                    visual.setEnabled(true);
                    visual.setVisible(true);
                }
                else if (about.isEnabled() == true){
                    menu.setText("Menu");

                    vocab.setEnabled(true);
                    vocab.setVisible(true);
    
                    grammer.setEnabled(true);
                    grammer.setVisible(true);

                    about.setEnabled(false);
                    about.setVisible(false);
                    
                    account.setEnabled(false);
                    account.setVisible(false);
    
                    visual.setEnabled(false);
                    visual.setVisible(false);
                }
                
            }
        });
            //menu options;

            //about
        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(aboutText.isVisible() == false){
                    aboutText.setVisible(true);

                    account.setEnabled(false);
                    account.setVisible(false);

                    visual.setEnabled(false);
                    visual.setVisible(false);

                    menu.setEnabled(false);
                    menu.setVisible(false);

                    about.setText("Return");
                    about.setBounds(100, 150, 200, 100);
                }
                else if(aboutText.isVisible() == true){
                    aboutText.setVisible(false);

                    about.setText("About");
                    about.setBounds(125, 450, 500, 100);

                    account.setEnabled(true);
                    account.setVisible(true);

                    visual.setEnabled(true);
                    visual.setVisible(true);

                    menu.setEnabled(true);
                    menu.setVisible(true);

                    
                }

            }
        });    

            //visual
        visual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(darkModeButton.isVisible() == false){
                    about.setVisible(false);
                    about.setEnabled(false);

                    account.setEnabled(false);
                    account.setVisible(false);

                    visual.setText("Return");
                    visual.setBounds(100, 50, 200, 100);

                    menu.setEnabled(false);
                    menu.setVisible(false);

                    darkModeButton.setVisible(true);
                    darkModeButton.setEnabled(true);

                    lightModeButton.setVisible(true);
                    lightModeButton.setEnabled(true);
                }
                else if(darkModeButton.isVisible() == true){
                    darkModeButton.setVisible(false);
                    darkModeButton.setEnabled(false);

                    lightModeButton.setVisible(false);
                    lightModeButton.setEnabled(false);
                    
                    about.setVisible(true);
                    about.setEnabled(true);

                    account.setEnabled(true);
                    account.setVisible(true);

                    visual.setText("Visual");
                    visual.setBounds(125, 350, 500, 100);

                    menu.setEnabled(true);
                    menu.setVisible(true);
                }
            }
        });    

        darkModeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });    

        lightModeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });    

            //account
        account.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(completionLabel.isVisible() == false){
                    about.setVisible(false);
                    about.setEnabled(false);


                    account.setText("Return");
                    account.setBounds(100, 50, 200, 100);

                    menu.setEnabled(false);
                    menu.setVisible(false);

                    visual.setVisible(false);
                    visual.setEnabled(false);

                    completionLabel.setVisible(true);

                    usernameLabel.setVisible(true);
                    
                }
                else if(completionLabel.isVisible() == true){
                    about.setVisible(true);
                    about.setEnabled(true);


                    account.setText("Accounts");
                    account.setBounds(125, 250, 500, 100);

                    menu.setEnabled(true);
                    menu.setVisible(true);

                    visual.setVisible(true);
                    visual.setEnabled(true);

                    completionLabel.setVisible(false);

                    usernameLabel.setVisible(false);
                }
            }
        });    

        //lessons;

        vocab.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                menu.setEnabled(false);
                menu.setVisible(false);
                
                vocab.setEnabled(false);
                vocab.setVisible(false);

                grammer.setEnabled(false);
                grammer.setVisible(false);

                education.setEnabled(true);
                education.setVisible(true);
                
                shopping.setEnabled(true);
                shopping.setVisible(true);

                travel.setEnabled(true);
                travel.setVisible(true);

                returnButton.setEnabled(true);
                returnButton.setVisible(true);
                
            }
        });
            //Vocab genres

        //education    
        education.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                education.setEnabled(false);
                education.setVisible(false);
                
                shopping.setEnabled(false);
                shopping.setVisible(false);

                travel.setEnabled(false);
                travel.setVisible(false);

                questionTitle.setBounds(100, 125, 500, 100);
                optionOne.setBounds(100, 300, 200, 100);
                optionTwo.setBounds(400, 300, 200, 100);
                optionThree.setBounds(100, 425, 200, 100);
                optionFour.setBounds(400, 425, 200, 100);
                

                optionOne.setEnabled(true);
                optionTwo.setEnabled(true);
                optionThree.setEnabled(true);
                optionFour.setEnabled(true);


                questionTitle.setVisible(true);
                optionOne.setVisible(true);
                optionTwo.setVisible(true);
                optionThree.setVisible(true);
                optionFour.setVisible(true);

                //we now make the questions based on the level
                currentLesson = new Lesson("V", "E", 1);

                
                    // get question info
                questionInfo = currentLesson.getQuestion().getInfo();

                // load ui
                questionTitle.setText(questionInfo[0]);
                if(questionTitle.getText().substring(questionTitle.getText().length()-4,questionTitle.getText().length()).equals(".png")){
                    imageRecognitionMC = new ImageIcon( questionTitle.getText());
                    questionTitle.setText("");
                    questionTitle.setIcon(imageRecognitionMC);
                }
                optionOne.setText(questionInfo[1]);
                optionTwo.setText(questionInfo[2]);
                optionThree.setText(questionInfo[3]);
                optionFour.setText(questionInfo[4]);

                correctAns = questionInfo[5];//setting up the correct answer, 5 becuase thats were you get the correct answer when returned
                


                //the beginning of the loop of the lesson starts here

                optionOne.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        //checks if the answer was correct or incorrect and proceeds to move on
                        if(questionInfo[1].equals(correctAns) ){ //checks to see if correct answer was selected
                            currentLesson.correctAnswers++;
                            currentLesson.currentQuestion++;
                          
                        }
                        else{
                            currentLesson.incorrectAnswers++;
                            currentLesson.currentQuestion++;
                            
                        }

                        //cheicking if a new lesson needs to be made 

                        if(currentLesson.currentQuestion == 10){
                            optionOne.setEnabled(false);
                            optionTwo.setEnabled(false);
                            optionThree.setEnabled(false);
                            optionFour.setEnabled(false);

                            questionTitle.setVisible(false);
                            optionOne.setVisible(false);
                            optionTwo.setVisible(false);
                            optionThree.setVisible(false);
                            optionFour.setVisible(false);

                            finalScore.setText(currentLesson.correctAnswers + " / " + 10);
                            finalScore.setBounds(250, 360, 200, 100);
                            finalScore.setVisible(true); 
                        }
                        else{
                            questionInfo = currentLesson.getQuestion().getInfo();

                            // load ui
                            questionTitle.setText(questionInfo[0]);
                            optionOne.setText(questionInfo[1]);
                            if(questionTitle.getText().substring(questionTitle.getText().length()-4,questionTitle.getText().length()).equals(".png")){
                                imageRecognitionMC = new ImageIcon( questionTitle.getText());
                                questionTitle.setText("");
                                questionTitle.setIcon(imageRecognitionMC);
                            }
                            optionTwo.setText(questionInfo[2]);
                            optionThree.setText(questionInfo[3]);
                            optionFour.setText(questionInfo[4]);

                            correctAns = questionInfo[5];//setting up the correct answer, 5 becuase thats were you get the correct answer when returned
                        }
                    }
                });  
                optionTwo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        //checks if the answer was correct or incorrect and proceeds to move on
                        if(questionInfo[2].equals(correctAns) ){ //checks to see if correct answer was selected
                            currentLesson.correctAnswers++;
                            currentLesson.currentQuestion++;
                           
                        }
                        else{
                            currentLesson.incorrectAnswers++;
                            currentLesson.currentQuestion++;
                            
                        }

                        //cheicking if a new lesson needs to be made 

                        if(currentLesson.currentQuestion == 10){
                            optionOne.setEnabled(false);
                            optionTwo.setEnabled(false);
                            optionThree.setEnabled(false);
                            optionFour.setEnabled(false);

                            questionTitle.setVisible(false);
                            optionOne.setVisible(false);
                            optionTwo.setVisible(false);
                            optionThree.setVisible(false);
                            optionFour.setVisible(false);

                            finalScore.setText(currentLesson.correctAnswers + " / " + 10);
                            finalScore.setBounds(250, 360, 200, 100);
                            finalScore.setVisible(true);
                        }
                        else{
                            questionInfo = currentLesson.getQuestion().getInfo();

                            // load ui
                            questionTitle.setText(questionInfo[0]);
                            optionOne.setText(questionInfo[1]);
                            if(questionTitle.getText().substring(questionTitle.getText().length()-4,questionTitle.getText().length()).equals(".png")){
                                imageRecognitionMC = new ImageIcon( questionTitle.getText());
                                questionTitle.setText("");
                                questionTitle.setIcon(imageRecognitionMC);
                            }
                            optionTwo.setText(questionInfo[2]);
                            optionThree.setText(questionInfo[3]);
                            optionFour.setText(questionInfo[4]);

                            correctAns = questionInfo[5];//setting up the correct answer, 5 becuase thats were you get the correct answer when returned
                        }
                    }
                }); 
                optionThree.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        //checks if the answer was correct or incorrect and proceeds to move on
                        if(questionInfo[3].equals(correctAns)){ //checks to see if correct answer was selected
                            currentLesson.correctAnswers++;
                            currentLesson.currentQuestion++;
                           
                        }
                        else{
                            currentLesson.incorrectAnswers++;
                            currentLesson.currentQuestion++;
                            
                        }

                        //cheicking if a new lesson needs to be made 

                        if(currentLesson.currentQuestion == 10){
                            optionOne.setEnabled(false);
                            optionTwo.setEnabled(false);
                            optionThree.setEnabled(false);
                            optionFour.setEnabled(false);

                            questionTitle.setVisible(false);
                            optionOne.setVisible(false);
                            optionTwo.setVisible(false);
                            optionThree.setVisible(false);
                            optionFour.setVisible(false);

                            finalScore.setText(currentLesson.correctAnswers + " / " + 10);
                            finalScore.setBounds(250, 360, 200, 100);
                            finalScore.setVisible(true);
                        }
                        else{
                            questionInfo = currentLesson.getQuestion().getInfo();

                            // load ui
                            questionTitle.setText(questionInfo[0]);
                            if(questionTitle.getText().substring(questionTitle.getText().length()-4,questionTitle.getText().length()).equals(".png")){
                                imageRecognitionMC = new ImageIcon( questionTitle.getText());
                                questionTitle.setText("");
                                questionTitle.setIcon(imageRecognitionMC);
                            }
                            optionOne.setText(questionInfo[1]);
                            optionTwo.setText(questionInfo[2]);
                            optionThree.setText(questionInfo[3]);
                            optionFour.setText(questionInfo[4]);

                            correctAns = questionInfo[5];//setting up the correct answer, 5 becuase thats were you get the correct answer when returned
                        }
                    }
                }); 
                optionFour.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        //checks if the answer was correct or incorrect and proceeds to move on
                        if(questionInfo[4].equals(correctAns)){ //checks to see if correct answer was selected
                            currentLesson.correctAnswers++;
                            currentLesson.currentQuestion++;
                           
                        }
                        else{
                            currentLesson.incorrectAnswers++;
                            currentLesson.currentQuestion++;
                            
                        }

                        //cheicking if a new lesson needs to be made 

                        if(currentLesson.currentQuestion == 10){
                            optionOne.setEnabled(false);
                            optionTwo.setEnabled(false);
                            optionThree.setEnabled(false);
                            optionFour.setEnabled(false);

                            questionTitle.setVisible(false);
                            optionOne.setVisible(false);
                            optionTwo.setVisible(false);
                            optionThree.setVisible(false);
                            optionFour.setVisible(false);

                            finalScore.setText(currentLesson.correctAnswers + " / " + 10);
                            finalScore.setBounds(250, 360, 200, 100);
                            finalScore.setVisible(true);
                        }
                        else{
                            questionInfo = currentLesson.getQuestion().getInfo();

                            // load ui
                            questionTitle.setText(questionInfo[0]);
                            if(questionTitle.getText().substring(questionTitle.getText().length()-4,questionTitle.getText().length()).equals(".png")){
                                imageRecognitionMC = new ImageIcon( questionTitle.getText());
                                questionTitle.setText("");
                                questionTitle.setIcon(imageRecognitionMC);
                            }
                            optionOne.setText(questionInfo[1]);
                            optionTwo.setText(questionInfo[2]);
                            optionThree.setText(questionInfo[3]);
                            optionFour.setText(questionInfo[4]);

                            correctAns = questionInfo[5];//setting up the correct answer, 5 becuase thats were you get the correct answer when returned
                        }
                    }
                });       
            
                
                


            }
        });
        


       
        grammer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                menu.setEnabled(false);
                menu.setVisible(false);
                
                vocab.setEnabled(false);
                vocab.setVisible(false);

                grammer.setEnabled(false);
                grammer.setVisible(false);

                punctuation.setEnabled(true);
                punctuation.setVisible(true);
                
                verbs.setEnabled(true);
                verbs.setVisible(true);

                returnButton.setEnabled(true);
                returnButton.setVisible(true);
                
            }
        });

        returnButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){


                
                returnButton.setEnabled(false);
                returnButton.setVisible(false);

                if(education.isEnabled() == true){
                    education.setEnabled(false);
                    education.setVisible(false);
                    
                    shopping.setEnabled(false);
                    shopping.setVisible(false);

                    travel.setEnabled(false);
                    travel.setVisible(false);
                }

                else if (punctuation.isEnabled() == true){
                    punctuation.setEnabled(false);
                    punctuation.setVisible(false);

                    verbs.setEnabled(false);
                    verbs.setVisible(false);
                }

                questionTitle.setVisible(false);
                optionOne.setVisible(false);
                optionTwo.setVisible(false);
                optionThree.setVisible(false);
                optionFour.setVisible(false);


                menu.setEnabled(true);
                menu.setVisible(true);
                
                vocab.setEnabled(true);
                vocab.setVisible(true);

                grammer.setEnabled(true);
                grammer.setVisible(true);
                
                
            }
        });
    }

    

    Panel (){

        labelsArray[0] = title;
        labelsArray[1] = aboutText;
        labelsArray[2] = completionLabel;
        labelsArray[3] = usernameLabel;
        labelsArray[4] = questionTitle;
        labelsArray[5] = finalScore;

        buttonsArray[0] = login;
        buttonsArray [1] = menu;
        buttonsArray [2] = vocab;
        buttonsArray [3] = grammer;
        buttonsArray [4] = education;
        buttonsArray [5] = shopping;
        buttonsArray[6] = travel;
        buttonsArray[7] = returnButton;
        buttonsArray[8] = verbs;
        buttonsArray[9] = punctuation;
        buttonsArray[10] = account;
        buttonsArray[11] = visual;
        buttonsArray[12] = about;
        buttonsArray[13] = lightModeButton;
        buttonsArray[14] = darkModeButton;
        buttonsArray[15] = optionOne;
        buttonsArray[16] = optionTwo;
        buttonsArray[17] = optionThree;
        buttonsArray[18] = optionFour;
        
        //all images will be replaced with png files/images

        //title screen
        login.setBounds(300, 250, 200, 100);
        login.setText("Start");
        login.setEnabled(true);
        login.setVisible(true);

        title.setIcon(appNameIcon);
        title.setBounds(100, 50, 600, 150);
        title.setVisible(true);

        //background image
        backGround.setIcon(backGroundImg);
        backGround.setBounds(0, 0, 800, 600);
        backGround.setVisible(true);

        //home page
        menu.setBounds(100, 150, 200, 100);
        menu.setText("Menu"); // will be a png
        menu.setEnabled(false);
        menu.setVisible(false);

        vocab.setBounds(125, 250, 500, 100);
        vocab.setText("<html>Vocabulary<br>\"num of lessons done\" / 100  </html>"); //num of lessons done will be a variable that is stored and will count the amount of lessons done
        vocab.setEnabled(false);
        vocab.setVisible(false);

        grammer.setBounds(125, 350, 500, 100);
        grammer.setText("<html>Grammer<br>\"num of lessons done\" / 100  </html>"); //same rule of num of lessons here
        grammer.setEnabled(false);
        grammer.setVisible(false);

        returnButton.setBounds(100, 50, 200, 100);
        returnButton.setText("Return"); 
        returnButton.setEnabled(false);
        returnButton.setVisible(false);


        // menu options
        account.setBounds(125, 250, 500, 100);
        account.setText("Accounts"); 
        account.setEnabled(false);
        account.setVisible(false);

        visual.setBounds(125, 350, 500, 100);
        visual.setText("Visual"); 
        visual.setEnabled(false);
        visual.setVisible(false);

        about.setBounds(125, 450, 500, 100);
        about.setText("About"); 
        about.setEnabled(false);
        about.setVisible(false);

            //about
        aboutText.setBounds(125, 250, 500, 100);
        aboutText.setText("About ..."); 
        aboutText.setVisible(false);

            //visual
        darkModeButton.setBounds(125, 250, 500, 100);
        darkModeButton.setText("Dark"); 
        darkModeButton.setEnabled(false);
        darkModeButton.setVisible(false);

        lightModeButton.setBounds(125, 350, 500, 100);
        lightModeButton.setText("Light"); 
        lightModeButton.setEnabled(false);
        lightModeButton.setVisible(false);

            //account
        completionLabel.setBounds(125, 250, 500, 100);
        completionLabel.setText("0 / 100 %");
        completionLabel.setVisible(false);

        usernameLabel.setBounds(125, 150, 500, 100);
        usernameLabel.setText("You");
        usernameLabel.setVisible(false);

        //vocabulary
        travel.setBounds(125, 150, 500, 100);
        travel.setText("<html>Travel<br>\"num of lessons done\" / 10  </html>"); 
        travel.setEnabled(false);
        travel.setVisible(false);

        shopping.setBounds(125, 250, 500, 100);
        shopping.setText("<html>Shopping<br>\"num of lessons done\" / 10  </html>"); //num of lessons done will be a variable that is stored and will count the amount of lessons done
        shopping.setEnabled(false);
        shopping.setVisible(false);

        education.setBounds(125, 350, 500, 100);
        education.setText("<html>Education<br>\"num of lessons done\" / 10  </html>"); //same rule of num of lessons here
        education.setEnabled(false);
        education.setVisible(false);
        
        //grammer
        verbs.setBounds(125, 150, 500, 100);
        verbs.setText("<html>Verbs<br>\"num of lessons done\" / 10  </html>"); 
        verbs.setEnabled(false);
        verbs.setVisible(false);

        punctuation.setBounds(125, 250, 500, 100);
        punctuation.setText("<html>Punctuation<br>\"num of lessons done\" / 10  </html>"); //num of lessons done will be a variable that is stored and will count the amount of lessons done
        punctuation.setEnabled(false);
        punctuation.setVisible(false);

       

        //making the buttons work and adding what actions they will cause
        buttonActions();

        //overall frame
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        //adds all jObjects to the frame
        for(int k = 0; k < 2; k++){
            if(k < 1){
                for(int o = 0; o < labelsArray.length; o++){
                    if(labelsArray[o] == null){
                        o = labelsArray.length;
                        continue;
                    }
                    frame.add(labelsArray[o]);
                }
            }       
            else{
                for(int o = 0; o < buttonsArray.length; o++){
                    if(buttonsArray[o] == null){
                        o = buttonsArray.length;
                        continue;
                    }
                    frame.add(buttonsArray[o]);
                }
            }  
        }
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}