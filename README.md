# Intern challenge for White Whale

**Code Challenge: Gibberish Algorithm**
---------------------------------------

Challenge Overview
------------------

We are exticed taht you are intsereted in joiinng Wihte Wahle for the smumer.  Weoclme to yuor fsrit prommarging chanellge.  Yuor chnellage is to courtsnct a prrgoam taht tekas an Enilgsh txet snirtg as iupnt and rerutns rebadale giirebbsh lkie tihs.  It dseno’t mtaetr in waht oerdr the ltteres in a wrod are, but an iproamtnt tihng is taht the frsit and lsat ltteer be in the rghit pclae. The rset can be a taotl mses and you can sitll raed it whotuit a pboerlm.  Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe.

**The Basics:**
  
  - You may use *almost any* programming language... it's your choice.  See the supported options [here](http://ideone.com/).
  - Your program should leave the first and last letter of each word in place and scramble the rest.
  - Your program should not scamble punctuation (.,-'...etc.), numbers, or upper-case abbreviations.
  - See the [/text_files] folder for sample text files. 

**Input/Output:**
 
  - Name your program as follows: `gibgen.xx` (where xx is variable based on the language you choose)
  - Your program should be able to read text input from a string passed into STDIN
      - `gibgen.xx "This is a String"`
      - `cat mystringfile.txt | gibgen.xx`
  - Your program should output to the console.

_Note: This challenge is based on a popular word gibberish meme. You can improve the readability by looking at a [researcher's take](http://www.mrc-cbu.cam.ac.uk/people/matt.davis/cmabridge/) on the truths/myths of this meme, but this is not required._

What to do
----------
1. [Download](http://git-scm.com/downloads) & install Git on your machine

2. <a href="https://github.com/trentgillham/whitewhaleintern#fork-destination-box" class="btn grouped" data-method="POST" rel="nofollow" title="Fork">Fork</a> this project - Go [here](https://github.com/trentgillham/whitewhaleintern) and click the "Fork" button (located on the upper-right side of the screen)

2. Clone your new fork'd repository to your local machine - `git clone https://github.com/trentgillham/whitewhaleintern.git`
3. Complete the code challenge and fill out the Quick Start & Questions in the the README (see below)
4. `git add` and `git commit` your local repository as you go
4. Push your code and README back to Github occasionally - `git push origin master`
5. Email [gillham@whitewhaleanalytics.com](mailto:gillham@whitewhaleanalytics.com) with the Commit URL to your fork'd repository that you want reviewed. It should include at least 2 files: (1) your updated README with Coding Questions answered, and (2) your program (gibgen.xx)
   - Copy and paste the URL into the email along with your name... it should look something like this:
       - https://github.com/YOUR_USERNAME_HERE/whitewhaleintern.git

_Note: If you have any questions, email [gillham@whitewhaleanalytics.com](mailto:gillham@whitewhaleanalytics.com)._

Judging Criteria
----------------

Your responses to the **Coding Questions** at the bottom of this README are the *Most Important* part of this challenge. A working, fully fault-tolerant program that we just can't break, albeit awesome, is the least important.  Why is that?  Remember, we don't expect you to be expert programmers (just yet)... We want to see how you think through a problem.  


For completion by applicant
===========================

Quick Start
-----------

- This program will take in a string from the command line and print out the shuffled version according to the problem specifications. However, there are a few points to take into account:
- I used Java to implement my solution
- Please remove all “” symbols from the string except the ones before and after the argument
- Only command line arguments can be used, the reasoning for which can be found in the question answers

Sample Run Through: 

javac Gibgen.java 
java Gibgen "Machine learning is the subfield of computer science that, according to Arthur Samuel in 1959, gives computers the ability to learn without being explicitly programmed. Evolved from the study of pattern recognition and computational learning theory in artificial intelligence, machine learning explores the study and construction of algorithms that can learn from and make predictions on data – such algorithms overcome following strictly static program instructions by making data-driven predictions or decisions, through building a model from sample inputs. Machine learning is employed in a range of computing tasks where designing and programming explicit algorithms with good performance is difficult or unfeasible; example applications include email filtering, detection of network intruders or malicious insiders working towards a data breach, optical character recognition (OCR), learning to rank and computer vision."

Miahcne lenaring is the slfbeiud of ceupotmr sncecie taht, ancoircdg to Aurthr Smueal in 1959, gveis cmtropues the aibltiy to lrean wtohuit bieng eipclixlty pogmrmdaer. Eloevvd from the sutdy of paettrn rciogietnon and cpimonaautotl lraening teorhy in aiarictfil inieenclgtle, mcnahie lairnneg exproles the sduty and crinoctotsun of amhtiogrls taht can leran form and mkae peitonicdrs on dtaa – scuh aimltorghs omeorvce folnwiolg sctiltry sttiac pgrarom irotcutsnins by mnikag ddra-eavitn pncoedtiirs or docsiisen, torghuh blindiug a moedl from slapme iunstp. Mhniace lneianrg is eopmlyed in a rngae of coimnptug tskas where disnnegig and pmmnorgraig elxipict alromthgis wtih good pcemnorarfe is dfuicflit or usiebanelf; elapxme atiinaclopps iucnlde email fltegniri, dcieteotn of nwrotek inrterdus or miculaois ienisdrs wnkoirg trdowas a dtaa bhrcae, octapil catcahrer rgooitncien (OCR), lnrnaieg to rank and cutpmeor vision. 


Coding Questions
----------------

Question 1

I began designing my solution to this problem by thinking about what language to complete it in, the choice to use Java was simply based on the fact that it is what I am most familiar with, and I would therefore have an easier time completing the challenge. Initially, I realized that I wanted to divide my program into two “sections”, one of which would be responsible for reading and formatting the input string properly, while the other would be used to actually scramble individual words. Because I was treating these two parts essentially as different sub-problems, I made the choice to create a different method called scrambleWord, which could be called for each individual word from the larger string. In my program I decided to make it so input could only be entered by using a command line argument. This decision was made so that I could focus on developing a more concise scramble algorithm, rather than worrying about the increased complexity that would arise from allowing file input. In the begging of execution, within the main method, this program will split the command line argument by space characters, allowing me to store each individual word from the string in an array called wordArray. This provided me with a simple way to both input the data, as well as organize it in a manner that gives me access to individual words. Next, the program will iterate through this array of words and call scrambleWord on each one, which will therefore scramble and print each word from the original string one at a time. When designing how each word is actually scrambled inside the scrambleWord method, I made a few design decisions that allowed me to successfully crack the problem. More specifically, this method essentially has two parts, the first of which goes through the word and determines which characters are able to be shuffled or not (i.e is it punctuation), and the second of which moves these characters to random areas. I begin by turning the word I am attempting to scramble into an array of characters called originalChars, by using the toCharArray() method. This step was done in order to allow easier access to the individual characters within the word. I also decided to create a LinkedList of characters called toShuffle. This list is important in determining the characters within the word that are permitted to move. In addition, it is used almost as a “holding area” for symbols that can be moved back to random areas within the word, and was therefore created as a LinkedList to make it easier to delete these characters once they are re-added at a random location in the scrambled word. After both the originalChar array and the toShuffle list have been created, I iterate through the characters in the original array (ignoring the first and last characters), and populate the toShuffle list with any character that is not punctuation or a capital letter, thus filling the “holding area”. I then realized that I needed a way to shuffle the order of the symbols, and decided to utilize the Collections.shuffle() method, which ultimately allowed me to transform the list into a collection of randomly ordered symbols to be placed at locations in the shuffled word. The next part of the algorithm tackles the problem of adding these symbols back into the original character array. It does this by first iterating through the array, and determining if each location is permitted to change, meaning it is not punctuation, a capital letter, or the first/last letter. If it passes these test, the character at that index is then replaced by the first value of the now randomly ordered “holding area” list. This process continues until all values from the list have been added back to valid locations in the original array, providing us with the character ordering for a shuffled version of the original. Finally, this array is converted back into a string and printed, before the program returns to main and moves on to the next word. The one drawback that I have found to this solution, is that is does not ensure that the word returned is ALWAYS shuffled, for example the shuffled word could have been identical to the one entered. 

Question 2

The hardest part about this problem, was figuring out a way to develop the algorithm in a way that allowed it to be relatively concise, but also made it so positions of punctuation, as well as capital letters were not shuffled in the new word. I believe I managed to overcome this obstacle, however, by doing so I was forced to use a nested loop, which slightly increased the complexity of the overall algorithm. I feel like this tradeoff is justified, and using the nested loop seemed like the best way to ensure that the algorithm could still be implemented in a relatively elegant manner. The actual way that I solved this problem, was to utilize two different data structures, and move characters between them. More specifically, these were a character array and character list, the former of which is used to store all the characters of the original word, while the latter acts as a “holding area” for symbols that are permitted to be shuffled. Then by iterating through both of these structures at specific times, I was able to manipulate the array in order to turn it into a shuffled version of itself. Another hard decision that I decided to make was to only allow command line input and not allowing files to be used as well. I made this choice because it was my goal with this program, to showcase the implementation that I created in order to actually solve the problem. Because of this I felt that adding additional input methods would take away from the readers ability to easily understand and analyze the solution I created. There were other small scale design decisions that were slightly difficult to make, because they had varying effects of the readability of the code. For example, I could have returned a String from the shuffleWord method and printed it in main, instead of printing the shuffled word directly in the method. However, all of these design decisions were made so that others could better understand my thought process when designing the algorithm. 