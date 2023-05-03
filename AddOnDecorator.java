import java.util.Random;

public abstract class AddOnDecorator extends Team{
}

class AddOnCountryName extends AddOnDecorator{
    Team team_;
    static String[] countries = {
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina",
            "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados",
            "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",
            "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon",
            "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Democratic Republic of the Congo",
            "Costa Rica", "Côte d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic",
            "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt",
            "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (formerly Swaziland)", "Ethiopia",
            "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada",
            "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India",
            "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan",
            "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho",
            "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia",
            "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia, Federated States of",
            "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (formerly Burma)", "Namibia",
            "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia (formerly Macedonia)",
            "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru",
            "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis",
            "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", " Sao Tome and Principe",
            "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore",
            "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan",
            "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan",
            "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan",
            "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America",
            "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City (Holy See)", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
    };

    AddOnCountryName(Team t){
        this.team_ = t;
        this.id_ = t.id_;
        Integer len = countries.length;
        Random rand = new Random();
        int r = rand.nextInt(0, len);
        this.name_ = t.name_ + " " + countries[r];
    }


}

class AddOnColorName extends AddOnDecorator{
    Team team_;
    String[] colors = {
            "AliceBlue", "AntiqueWhite", "Aqua", "Aquamarine", "Azure", "Beige", "Bisque", "Black", "BlanchedAlmond",
            "Blue", "BlueViolet", "Brown", "BurlyWood", "CadetBlue", "Chartreuse", "Chocolate", "Coral", "CornflowerBlue",
            "Cornsilk", "Crimson", "Cyan", "DarkBlue", "DarkCyan", "DarkGoldenRod", "DarkGray", "DarkGrey", "DarkGreen",
            "DarkKhaki", "DarkMagenta", "DarkOliveGreen", "DarkOrange", "DarkOrchid", "DarkRed", "DarkSalmon", "DarkSeaGreen",
            "DarkSlateBlue", "DarkSlateGray", "DarkSlateGrey", "DarkTurquoise", "DarkViolet", "DeepPink", "DeepSkyBlue", "DimGray",
            "DimGrey", "DodgerBlue", "FireBrick", "FloralWhite", "ForestGreen", "Fuchsia", "Gainsboro", "GhostWhite", "Gold",
            "GoldenRod", "Gray", "Grey", "Green", "GreenYellow", "HoneyDew", "HotPink", "IndianRed", "Indigo", "Ivory",
            "Khaki", "Lavender", "LavenderBlush", "LawnGreen", "LemonChiffon", "LightBlue", "LightCoral", "LightCyan",
            "LightGoldenRodYellow", "LightGray", "LightGrey", "LightGreen", "LightPink", "LightSalmon", "LightSeaGreen",
            "LightSkyBlue", "LightSlateGray", "LightSlateGrey", "LightSteelBlue", "LightYellow", "Lime", "LimeGreen",
            "Linen", "Magenta", "Maroon", "MediumAquaMarine", "MediumBlue", "MediumOrchid", "MediumPurple", "MediumSeaGreen",
            "MediumSlateBlue", "MediumSpringGreen", "MediumTurquoise", "MediumVioletRed", "MidnightBlue", "MintCream",
            "MistyRose", "Moccasin", "NavajoWhite", "Navy", "OldLace", "Olive", "OliveDrab", "Orange", "OrangeRed",
            "Orchid", "PaleGoldenRod", "PaleGreen", "PaleTurquoise", "PaleVioletRed", "PapayaWhip", "PeachPuff", "Peru",
            "Pink", "Plum", "PowderBlue", "Purple", "RebeccaPurple", "Red", "RosyBrown", "RoyalBlue", "SaddleBrown",
            "Salmon", "SandyBrown", "SeaGreen", "SeaShell", "Sienna", "Silver", "SkyBlue", "SlateBlue", "SlateGray",
            "SlateGrey", "Snow", "SpringGreen", "SteelBlue", "Tan", "Teal", "Thistle", "Tomato", "Turquoise", "Violet",
            "Wheat", "White", "WhiteSmoke", "Yellow", "YellowGreen"
    };

    AddOnColorName(Team t){
        this.team_ = t;
        this.id_ = t.id_;
        Integer len = colors.length;
        Random rand = new Random();
        int r = rand.nextInt(0, len);
        this.name_ = t.name_ + " " + colors[r];
    }


}

class AddOnAnimalName extends AddOnDecorator{
    Team team_;
    String[] animals = {
            "Alpaca", "Anteater", "Armadillo", "Badger", "Bat", "Beaver", "Bee", "Bison", "Bobcat", "Buffalo",
            "Butterfly", "Camel", "Capybara", "Caribou", "Cat", "Chameleon", "Cheetah", "Chipmunk", "Coati", "Cobra",
            "Cockroach", "Crab", "Crane", "Crocodile", "Crow", "Deer", "Dingo", "Dolphin", "Donkey", "Dragonfly",
            "Eagle", "Elephant", "Elk", "Falcon", "Ferret", "Flamingo", "Fox", "Gazelle", "Giraffe", "Goat",
            "Gorilla", "GrizzlyBear", "Hamster", "Hedgehog", "Hippopotamus", "Horse", "Hummingbird", "Hyena", "Ibex", "Iguana",
            "Jackal", "Jaguar", "Kangaroo", "Koala", "KomodoDragon", "Lemming", "Lemur", "Leopard", "Lion", "Llama",
            "Lynx", "Marmot", "Meerkat", "Moose", "Narwhal", "Octopus", "Opossum", "Orangutan", "Ostrich", "Otter",
            "Owl", "Panda", "Penguin", "Pig", "Platypus", "Porcupine", "Possum", "Puma", "Rabbit", "Raccoon",
            "Ram", "Rattlesnake", "RedPanda", "Reindeer", "Rhino", "Scorpion", "Seagull", "Seahorse", "Shark", "Sheep",
            "Skunk", "Sloth", "Snail", "Snake", "Squirrel", "Tiger", "Toucan", "Turkey", "Turtle", "Walrus",
            "Weasel", "Whale", "Wolf", "Wolverine", "Wombat", "Woodpecker", "Yak", "Zebra"
    };

    AddOnAnimalName(Team t){
        this.team_ = t;
        this.id_ = t.id_;
        Integer len = animals.length;
        Random rand = new Random();
        int r = rand.nextInt(0, len);
        this.name_ = t.name_ + " " + animals[r];
    }


}
