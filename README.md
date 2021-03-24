# Assignment 2

# Problem 1: [13 Points]

Suppose after successfully developing a Tea Garden Automation System (TeaGAS) in your
Microcontroller sessional you have decided to apply for funding from Startup Bangladesh. In
your lab project, you built the hardware around ATMega32 microcontroller. To apply for
funding, you need to show how your product can be diversified. So, you have made a
comprehensive plan to support a lot of options for different components. The specification of the
system is below.

**TeaGAS System Overview:**

The system consists of a hardware device and a web server for the administrator. The leaf
collectors put their load (baskets) on the device and swipe an ID card. The data is sent to the
webserver. As the tea gardens are in remote areas, there is a storage component in the device to
backup data when internet connection is not available. A display is also attached with the device.
On the webserver the admin can add or remove leaf collectors and analyze the data received
from the device. The major components of the system are:

1. **Microcontroller/Microprocessor:** You can choose any of ATMega32, Arduino Mega or
   Raspberry Pi around which the device will be built.
2. **Weight Measurement:** There are two options: Implement with load Sensor, Interface
   with a weight module.
3. **Identification:** ATMega32 and Arduino will use RFID card and Raspberry Pi will use
   NFC card.
4. **Storage:** If Raspberry Pi is used, storage will be provided along with it. ATMega32 and
   Arduino will be interfaced with SD card.
5. **Display:** Raspberry Pi will use touch screen display. Arduino and ATMega32 will be
   interfaced with LED and LCD display respectively.
6. **Internet connection:** Arduino and ATMega32 can choose from WiFi module or GSM
   module. Raspberry pi supports Ethernet too.
7. **Controller:** The touch screen of the raspberry pi doubles as a controller. Buttons need to
   be added for other two options.

In summary, building the device requires performing all the complex steps mentioned above one
by one.

The web server can be developed with any of the three frameworks: Django, Spring and Laravel.

Your project partner who is a two times business case study award winner goes through the plan
and suggests that you should not confuse the clients with all the unnecessary details and
proposed the following four packages.


# Assignment 2

The client would choose a package, mention how the device would be connected to internet
(WiFi, Ethernet or SIM card) and choose a framework for the web server.

Tasks:

```
 Identify the design pattern(s) that can best capture the scenario above.
 Implement the scenario in Java.
 You just need to implement the structure. For example, you do not need to implement
how load sensor would measure weight. Just print “Measuring weight with Load Sensor”
on console.
 For demonstration user would be prompted to give input on console and based on the
choice, the details (name of the specific components) of the system would be shown on
console.
```
# Problem 2: [ 7 Points]

Assume that you are trying to implement syntax highlighting in a programming language editor. The
editor currently supports 3 languages (C, CPP and Python). To perform this, you need to be able to parse
the .c, .cpp and .py source files. Each language has specific rules of parsing. All the parsers implement an
interface named Parser which contains all the functions required to parse a file. There is an Interface for
the aesthetics (font, style, color etc.) of the source codes. The editor uses **Courier New, Monaco** and
**Consolas** font for C, CPP and Python respectively. For simplicity assume that the other parameters (style
and color of keywords) are set to default (Normal and blue). Also assume that multiple instances of the
editor cannot run simultaneously.

Tasks:

```
 Identify the design pattern(s) that can best capture the scenario above.
 Implement the scenario in Java
```
```
Package Details
Silver ATMega32 with load sensor
Gold Arduino with weight module
Diamond Raspberry Pi with load sensor
Platinum Raspberry Pi with weight module
```

# Assignment 2

```
 You just need to implement the structure. For example, you do not need to implement
how the parsers would actually parse the source files.
 For demonstration, user would input the filename with extension on console and see the
selected parser and font name on screen.
```
# Guideline:

1. The main objective of this assignment is to evaluate your design pattern skill. These
   problems can be solved in different ways. But we will evaluate you based on how you
   have applied your design pattern knowledge to solve the problems. Just printing correct
   values will not ensure full marks.
2. Put all the source files in a directory and rename it with your 7-digit student ID. Zip this
   directory and rename with your 7-digit student ID. Finally submit the Zip file (e.g.
   1605XXX.zip)
3. Please DO NOT COPY solutions from anywhere (e.g., your friends, seniors, internet).
   Any form of plagiarism, irrespective of source or destination, will result in -100% marks
   in the online/offline.
4. Deadline: 10 PM, March 22, 2019
5. For any query, contact: toufikuzzaman@teacher.cse.buet.ac.bd


