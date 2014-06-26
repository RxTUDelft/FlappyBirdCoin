FlappyBirdCoin
==============

Flappy Bird clone controlled by [coin acceptor hardware](https://github.com/RxTUDelft/Rx-Coin-Acceptor).
Forked from [RxJavaGames/FlappyBird](https://github.com/RxTUDelft/RxJavaGames/tree/master/FlappyBird).

## Building

Make sure you have built Rx-Coin-Acceptor and that it is in your local maven repository:

    cd Rx-Coin-Acceptor
    mvn clean install

You can then build FlappyBirdCoin:

    cd FlappyBirdCoin
    mvn clean package

This will leave a `FlappyBirdCoin-1.0.0-jar-with-dependencies.jar` file in the `target` subfolder

## Running

    java -jar FlappyBirdCoin-1.0.0-jar-with-dependencies.jar {COMPORT}

On Windows `{COMPORT}` will be `COM1`, on Linux/OS X `/dev/tty0` or `/dev/ttyUSB0`, with possibly another number if you have multiple RS-232 ports.