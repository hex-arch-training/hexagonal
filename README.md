<div align="center">

# A hexagonal architecture training

![Java CI with Maven](https://github.com/hex-arch-training/hexagonal/actions/workflows/maven.yml/badge.svg)
[![CodeQL](https://github.com/hex-arch-training/hexagonal/workflows/CodeQL/badge.svg)](https://github.com/hex-arch-training/hexagonal/actions?query=workflow%3ACodeQL "Code quality workflow status")
[![License](https://img.shields.io/badge/License-MIT-blue)](#license "Go to license section")

An example implementation of the [My Thai Star](https://devonfw.com/website/pages/docs/master-my-thai-star.asciidoc_technical-design.html)
application in the hexagonal architecture.

</div>


# Modul architecture
Modules are grouped on multiple levels to facilitate working with a lot of code. 
The highest level consists of four groups: business, connector, orchestration,
and util. They are called subsystems.

![Subsystems](./documentation/images/subsystems.svg)

## Subsystem _business_
A business includes modules with business knowledge. 
They are divided into domains, which consist of two parts: the core and adapters.

![Subsystem business](./documentation/images/subsystem-business.svg)

### Core modules
A core implements pure business logic, independent of specific frameworks.
It is divided into four parts: domain, logic, port, and dto

#### Module _domain_
A domain contains entities and data types such as enumerations.
Entities can be used as data transport object if the modules don't need more specialized data transport objects.

#### Module _dto_ (data transport object)
A dto is a specialized data transport object. They are located in the requesting use case subsystem  
because they must be created for the specific needs of the use case.

#### Module _logic_
Logic is a module that implements use cases.

#### Module _port_
Port contains only interfaces and optionally transport objects necessary for communication between modules,
for example logic and adapters. 
Port belongs to the cora to make it easier to follow the rule that core modules do not depend on any other modules 
(except util). Port includes two kinds of interfaces: provided and required.

Provided interfaces are implemented by logic that provides access to logic for modules outside the core.

Required interfaces are implemented by adapter modules and are used by core modules.

### Adapter modules
A adapter modules implement technical aspects, and they are used to linking core modules to specific frameworks.

There are four main types of adapters, but this is not an exhaustive number: 
persistence, controller, service, connection.

#### Module _persistence_
This module allows to permanently store ata.

#### Module _controller_
This module provides the functionality of the domain through various protocols such as REST, WebService, Messaging.

#### Module _service_
This module allows to call the functionality of other domain through various protocols such as REST, WebService, Messaging.

#### Module _connection_
This module allows for direct communication between domains when both modules are included in the same service.

## Subsystem _connector_
A connector subsystem has a similar structure as the business subsystem, 
with the difference that instead of business knowledge and division into domains, 
we have knowledge about external systems here. The rest remains the same.

## Subsystem _util_
A util subsystem includes modules not related to business knowledge. 
They can be imported from any other module, but of course no cycles are allowed.

## Subsystem _orchestration_
An orchestration subsystem contains the objects necessary to create executable applications. 
It consists of two subsets, configurations and classes with main method.