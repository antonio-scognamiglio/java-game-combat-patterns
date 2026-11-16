## TRACCIA

Sistema di combattimento per un videogioco

Pattern: Factory + Strategy + Observer

Realizzare un semplice sistema di combattimento nel quale il giocatore può utilizzare differenti armi, come Spada, Arco e Bastone Magico. Le armi devono essere create attraverso una Factory e devono possedere un valore di danno iniziale. Il giocatore deve poter cambiare strategia di attacco scegliendo tra attacco normale, potente e rapido. Ogni attacco deve inoltre notificare automaticamente un sistema di statistiche che registra il danno inflitto e il numero di attacchi effettuati. Il programma deve simulare un combattimento e visualizzare le statistiche finali.

# OBIETTIVO

Realizzare un sistema di combattimento per un videogioco che utilizzi i pattern Factory, Strategy e Observer.

# DESCRIZIONE

Il sistema deve permettere al giocatore di utilizzare diverse armi (Spada, Arco, Bastone Magico) create tramite una Factory. Ogni arma ha un valore di danno iniziale. Il giocatore può cambiare strategia di attacco (normale, potente, rapido) e ogni attacco deve notificare un sistema di statistiche che registra il danno inflitto e il numero di attacchi effettuati. Il programma deve simulare un combattimento e visualizzare le statistiche finali.

# REQUISITI

1. **Factory Pattern**:
   - Creare una classe `WeaponFactory` che produce istanze di `Weapon` (Spada, Arco, Bastone Magico).
   - Ogni arma deve avere un valore di danno iniziale.

2. **Strategy Pattern**:
   - Implementare diverse strategie di attacco (`NormalAttack`, `PowerfulAttack`, `FastAttack`).
   - Ogni strategia deve modificare il danno dell'arma in base alla sua logica.

3. **Observer Pattern**:
   - Creare un sistema di statistiche (`StatisticsObserver`) che registra il danno inflitto e il numero di attacchi effettuati.
   - Ogni attacco deve notificare il sistema di statistiche.

4. **Simulazione del Combattimento**:
   - Il programma deve simulare un combattimento in cui il giocatore utilizza un'arma e cambia strategia di attacco.
   - Visualizzare le statistiche finali dopo la simulazione.

# ESEMPIO DI OUTPUT

```plaintext
Combattimento iniziato!
Attacco normale con Spada: danno 10
Attacco potente con Arco: danno 25
Attacco rapido con Bastone Magico: danno 15
Statistiche finali:
- Danno totale inflitto: 50
- Numero di attacchi: 3
```

# TASKS

- 1 Creare la classe base "Weapon", da cui partiranno le altre classi specifiche (Wizard Staff, Arch, Sword,)
- 1.1 Creare la classe concreta Sword, Wizard Staff e Arch, ogni classe concreta che estende una base ha senso nel momento in cui ha un attributo extra che normalmente non è presente in quella base tipo criticalChance per la spada, range per l'arco e manaCost per il bastone magico per esempio
- 1.2 creare la classe Giocatore,
- 2 Realizzare la factory che produce le armi, danno base, tipologia arma

---

- 3 Serve una classe Giocatore? Con un arma selezionata, presumibilmente prima la factory per potergliela assegnare
- 3.5 creare un nemico, con tot puntivita, e un eventuale arma, (alla fine è un giocatore)
- 4 Implementare lo strategy pattern, che servirà a cambiare la metodologia di attacco durante la partita
- 5 Implementare Observer per ascoltare gli attacchi (che sono gli eventi, danni )

# CHECKPOINT DI OGGI

Completare i primi due task

# IMPLEMENTAZIONI FUTURE

Implementare un sistema di precisione dell'arma, in base alla distanza, l'attacco può fallire o meno e simili
