<img src="doc/logo.png" align="right" width="180px"/>

# Chipper
An incomplete highly modular game engine for the JVM.

Documentation is a TODO. The client works, and there's a lot of useful utilities available, but the server is heavily incomplete and the protocol/networking system is half-baked.

The engine will evolve alongside the projects it is designed for.

Unstable, very unfinished. Hop in #lobby:sleeping.town on Matrix to talk about it.

# Client Eclipse Run Config

After running `./gradlew eclipse`, add a java application run configuration with the following properties:
Project: ChipperClient
Main class: com.playsawdust.chipper.client.ClientBootstrap
VM arguments: --add-opens java.base/jdk.internal.loader=ALL-UNNAMED
