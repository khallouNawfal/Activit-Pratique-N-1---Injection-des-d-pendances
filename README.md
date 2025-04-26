
# Rapport - Injection de dépendances 
## 1. Création de l'interface `IDao`

- L'interface `IDao` contient une méthode :
```java
double getData();
```

## 2. Création d'une implémentation de `IDao`

- Création d'une classe `DaoImpl` qui implémente `IDao`.
- La méthode `getData` retourne une valeur simulée (ex: une température).

## 3. Création de l'interface `IMetier`

- L'interface `IMetier` contient une méthode :
```java
double calcul();
```

## 4. Création d'une implémentation de `IMetier` avec couplage faible

- Création de la classe `MetierImpl` qui utilise une référence à `IDao`.
- L'objet `IDao` est injecté via un setter ou constructeur.

## 5. Injection des dépendances

### a. Par instanciation statique

- Création manuelle des objets :
```java
IDao dao = new DaoImpl();
IMetier metier = new MetierImpl();
metier.setDao(dao);
```

### b. Par instanciation dynamique

- Utilisation de `Class.forName` pour charger et instancier dynamiquement les classes :
```java
Class cDao = Class.forName("dao.DaoImpl");
IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
```

### c. En utilisant le Framework Spring

#### Version XML

- Définition des beans dans `applicationContext.xml`.
- Utilisation de `ClassPathXmlApplicationContext` pour charger le contexte Spring.

#### Version Annotations

- Utilisation des annotations `@Component`, `@Autowired`, `@Repository`, `@Service`.
- Détection automatique des beans avec `@ComponentScan`.
