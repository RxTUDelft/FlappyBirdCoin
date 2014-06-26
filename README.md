FlappyBirdCoin
==============

Flappy Bird clone controlled by [coin acceptor hardware](https://github.com/RxTUDelft/Rx-Coin-Acceptor).
Forked from [RxJavaGames/FlappyBird](https://github.com/RxTUDelft/RxJavaGames/tree/master/FlappyBird).


## Usage

Build with:

    mvn clean package

Run with:

    java -jar FlappyBirdCoin-1.0.0-jar-with-dependencies.jar {COMPORT}

On Windows `{COMPORT}` will be `COM1`, on Linux/OS X `/dev/tty0` or `/dev/ttyUSB0`, with possibly another number if you have multiple RS-232 ports.