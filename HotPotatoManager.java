========================================
  NINJAXXGAMES - HOLOGRAMME TOP 50
========================================

Ces fichiers affichent le classement general (top 50) via les placeholders
%ninjaxx_top_<n>_name% et %ninjaxx_top_<n>_points% fournis par NinjaxxGames.

PREREQUIS
---------
1. PlaceholderAPI installe.
2. NinjaxxGames demarre APRES PlaceholderAPI (au boot, la console affiche :
   "Hook PlaceholderAPI enregistre").
3. Verifie en jeu :  /papi parse me %ninjaxx_top_1_name%
   -> doit renvoyer le n°1 (ou "-" si personne n'a encore de points).


========================================
  OPTION A - DecentHolograms (recommande)
========================================

METHODE 1 (fichier pret a l'emploi) :
  1. Arrete le serveur.
  2. Copie le fichier :
        DecentHolograms/holograms/ninjaxx_top50.yml
     dans :
        plugins/DecentHolograms/holograms/ninjaxx_top50.yml
  3. IMPORTANT : ouvre le fichier et change la ligne "location:" :
        location: "world:0.5:120.0:0.5"
     -> mets le nom de ton monde et des coordonnees correctes
        format = monde:x:y:z
  4. Redemarre le serveur. (ou en jeu : /dh reload)
  5. Pour le repositionner ensuite : place-toi ou tu veux et fais
        /dh movehere ninjaxx_top50

METHODE 2 (commandes, aucune edition de fichier) :
  1. Place-toi en jeu a l'endroit voulu.
  2. Ouvre "DecentHolograms-commands.txt" et colle les commandes une par une
     (ou par paquets) dans le chat.
  -> Marche sur toutes les versions de DecentHolograms.


========================================
  OPTION B - HolographicDisplays
========================================

  1. Place-toi en jeu a l'endroit voulu.
  2. Ouvre "HolographicDisplays-commands.txt" et colle les commandes.
  Remarque : HolographicDisplays a besoin de l'extension PlaceholderAPI
  (souvent auto-installee). La syntaxe utilisee est {papi: ...}.
  Repositionner : /hd movehere ninjaxx_top50


========================================
  NOTES
========================================
- 50 lignes = hologramme tres haut. Pour un top 10, garde seulement
  les lignes #1 a #10.
- Les cases vides (#12, #13...) affichent "-" et "0" tant que pas assez
  de joueurs ont des points : c'est normal.
- Couleurs : & (ex: &e = jaune). Modifie a ta guise.
- Rafraichissement : DecentHolograms = update-interval 20 ticks (1s).
