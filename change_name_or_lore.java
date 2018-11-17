command /kacperkozbial:changenameorlore [<text>] [<text>]:
	description: Zmiana tytułu oraz opisu danego przedmiotu
	aliases: /changenameorlore, /change, /zmien
	trigger:
		if player has permission "kk.change.command":
			if argument 1 is set:
				if argument 1 is "name" or "nazwe":
					if argument 2 is set:
						if tool of the player is not air:
							set name of tool of the player to argument 2 parsed as text
							send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &7Nazwa przedmiotu zostala &apomyslnie &7zmieniona" to the player
							stop
						else:
							send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &cNie posiadasz nic w rece." to the player
							stop
					else:
						send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &cNie podales nazwy przedmiotu." to the player
						stop
				if argument 1 is "lore" or "opis":
					if argument 2 is set:
						if tool of the player is not air:
							set lore of tool of the player to argument 2 parsed as text
							send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &7Opis przedmiotu zostal &apomyslnie &7zmieniony" to the player
							stop
						else:
							send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &cNie posiadasz nic w rece." to the player
							stop
					else:
						send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &cNie podales opisu przedmiotu." to the player
						stop
				if argument 1 is "info":
					send coloured "&8>> &6&lK&4&lK&7-&3CHANGE &8<<" to the player
					send coloured "&8>> &3Tworca&7: &6kapi. &8(&cKacper Koźbiał&8)" to the player
					send coloured "&8>> &7Wersja skryptu: &9v0.1" to the player
					stop
				if argument 1 is not "name" or "lore" or "nazwe" or "opis" or "info":
					send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &cNiepoprawny argument." to the player
					stop
			else:
				send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &9Argumenty : " to the player
				send coloured "&9nazwe/name &7<nazwa> &8- &6zmienia nazwe przedmiotu" to the player
				send coloured "&9opis/lore &7<opis> &8- &6zmienia opis przedmiotu" to the player
				stop

		else:
			send coloured "&8[&6&lK&4&lK&7-&3CHANGE&8] &cBrak uprawnien." to the player
			stop
