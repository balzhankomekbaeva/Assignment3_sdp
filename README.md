README for Assignment 1: Adapter Pattern - Audio Player

Purpose: This assignment demonstrates the implementation of the Adapter Pattern to extend the functionality of an existing music player to support additional audio formats (WAV and AAC) without modifying the original MP3 player.


Adapter Pattern: Converts the interface of a class into another interface clients expect. Here, the AudioAdapter allows AudioPlayer to play WAV and AAC files.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

README for Assignment 2: Bridge Pattern - Remote Control System

Purpose: This assignment showcases the implementation of the Bridge Pattern to decouple a universal remote control system from various devices (TV, DVD Player, etc.), allowing flexibility in adding new devices and features.


Bridge Pattern: Separates abstraction (remote control) from its implementation (device), so they can evolve independently.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

README for Assignment 3: Composite Pattern - Menu System

Purpose: This assignment demonstrates the Composite Pattern by building a hierarchical menu system where a menu can contain other menus or menu items, suitable for a restaurant menu structure.


Composite Pattern: Composes objects into tree structures to represent part-whole hierarchies. Menu can contain both MenuItem and other Menu objects.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


README for Assignment 4: Decorator Pattern - Pizza Ordering System

Purpose: This assignment applies the Decorator Pattern to implement a flexible pizza ordering system that allows customers to customize their pizza with various toppings.


Decorator Pattern: Dynamically adds behavior to objects by wrapping them with other objects (decorators). Here, pizza is customized by adding toppings like cheese or pepperoni.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


README for Assignment 5: Facade Pattern - Smart Home System

Purpose: This assignment demonstrates the Facade Pattern to create a simplified interface for controlling multiple smart devices (lights, thermostat, security, entertainment) in a smart home system.


Facade Pattern: Provides a unified, high-level interface to a set of interfaces in a subsystem, making it easier to use. The SmartHomeFacade class simplifies the interaction with various smart devices.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


README for Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor

Purpose: This assignment demonstrates how to use the Flyweight Pattern to optimize memory usage in a text editor by sharing intrinsic state (character value, font, and size) across repeated characters.

Flyweight Pattern: Reduces memory usage by sharing common parts of objects. In this case, Character objects share intrinsic state (character value, font, size) and handle extrinsic state (position) separately.


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


README for Assignment 7: Proxy Pattern - Online Learning Platform

Purpose: This assignment uses the Proxy Pattern to implement lazy loading of video lectures in an online learning platform. Video lectures are only loaded when the user plays them.

Proxy Pattern: Provides a surrogate or placeholder for another object to control access to it. Here, ProxyVideoLecture lazily loads video lectures when play() is called.

