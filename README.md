# Java Game Combat Patterns

Sistema di combattimento modulare per videogiochi sviluppato in Java, con l'obiettivo di esplorare i design pattern Factory, Strategy e Observer.

## Requisiti

- JDK installato (include `javac` e `java`)
- Nessuna dipendenza esterna o strumento di build richiesto

## Struttura

```text
src/
  main/java/com/javagamecombat/  # Codice dell'applicazione
  test/java/                     # Spazio per i test
out/                             # Classi compilate (generato)
```

## Compilazione ed esecuzione

Dalla directory principale del progetto, su macOS o Linux:

```sh
mkdir -p out
javac -d out $(find src/main/java -name "*.java")
java -cp out com.javagamecombat.Main
```

L'output atteso è:

```text
Sistema di combattimento pronto.
```
