Moja Knji�nica
V projketu smo posku�ali vspostaviti knji�nico, kjer uporabniki lahko dajo knjige v posojo ali pa si jih sami izposodijo.
Storitve so na voljo le registriranim uporabnikom, prav tako imajo ti mo�nost komentiranja in dodajanja na seznam �elja, 
medtem ko imajo neregistrirani uporabniki le vpogled do komentarjev in knjig; do vnosa/dodajanja knjig, profila pa sploh nimajo dostopa.

Kako za�eti
Za testno uporabo "Moje knji�njice" na osebnem ra�unalniku potrebujemo razvoijalno okolje, kot je IntelliJ IDEA ali Eclipse. Celoten projekt iz GitHub uvozimo v �eljeno razvijalno okolje in po�enemo "KnjiznicaNoviApp" v desnem zgornjem kotu. Pazimo, da za�enemo aplikacijo le enkrat, saj druga�e bo port na katerem �elimo tesitrati �e poln in aplikacija bo vrnila napako. Po kon�anem nalaganju se nam na "local port-u", v na�em primeru se ta nahaja pod �tevilko v Spring datoteki imenovani "application.properties" pod "resources" ali viri - v tem primeru se port glasi 2223.

Pred zagonom
V razvijalnem okolju potrebujem JDK - Java Development Kit, ki ga je potrebno izbrati pri zagonu projetka. Dostopno na: http://www.oracle.com/technetwork/java/javase/downloads/index.html
Navodila za dodajanje JDK, �e ga nismo izbrali ob odprtju projekta: https://www.jetbrains.com/help/idea/configuring-mobile-java-sdk.html

Prav tako potrebujemo Spring, saj je temelj za povezovanje na�ih spletnih strani s podatkovno bazo. 
Spring dodamo v projekt po naslednjih korakih: https://www.tutorialspoint.com/spring/spring_hello_world_example.htm

Za spreminjanje podatkovne baze uporabimo MySQL Workbench, kjer so razvidne vse tabele s podatki aplikacije. Dostopno na: https://www.mysql.com/products/workbench/

Implementacija in uporaba Moja knji�nica trenutno ni mo�na na stre�niku, saj je �e v postopku razvoja. 

Znane napake: �e na enem ra�unalniku delate z JDK verzji 10, in preklopite na drugem na ni�jo verzijo, je mo�no, da nekateri deli ne bodo dealli, saj je JDK razlikuje. Zato prosimo, da preverite, da imate JDK poenoten na vseh ra�unalnikih.

Zgrajeno z
Spring - The web framework used
Maven - Dependency Management
Java - general-purpose computer-programming language
JSP -  technology that helps software developers create dynamically generated web pages based on HTML
JavaScript - a high-level, interpreted programming language used to make webpages interactive
CSS - a style sheet language used for describing the presentation of a document written in a markup language like HTML
HTML - the standard markup language for creating web pages and web applications.
MySQL - an open-source relational database management system

Dodajanje
Projekt je mo�no spreminjati, vendar nove verzije ni mo�no potisniti na GitHub, sej bi se lahko koda pome�ala. �e mislite, da ste na�li re�itev za kak�no napako ali ste najdli izbolj�avo, prosimo da nas kontaktirate na enega izmed slede�ih e-mail naslovov: toni.ivcetic@gmail.com, gasper.reher@gmail.com, marko.zemljaric@gmail.com, ziga.susin@gmail.com. Va�a kontribcija bo razvidna v spremembah (Changelog, version control) in na koncu dokumenta v Zahvalah.

Verzije
GitHub

Avtorji
Anton Haramija Iv�eti� - front end, dokumentacija, kotrole verzij
Marko Zemljari� - front end
Ga�per Reher - back end, baza, povezava med front endom in bazo
�iga �usin - back end, poenotenost izgleda front enda

Licenca
Ta projekt je pod licenco Fakultete za elektrotehniko, ra�unalni�tvo in informatiko. Je odprtokoden, dostopen za lastno uporabo vseh, ne pa za tr�ne namene.

Zahvale
Cobiss - za inspiracijo iskalnih funkcij knjig.