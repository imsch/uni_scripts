spielerhaende = [0, 0, 0, 0]
i = 0
mengeKarten = 32
anzahlSpieler = 4
while (mengeKarten >= anzahlSpieler):
    while (i < anzahlSpieler):
        spielerhaende[i] = spielerhaende[i] + 1
        i = i + 1
    mengeKarten = mengeKarten - anzahlSpieler
print((str(mengeKarten) + " Karten sind uebrig!"))