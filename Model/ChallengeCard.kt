package sonderegger.dk.drinklingz.Model

class ChallengeCard: Card() {
    override var title: String = "Challenge Card"
    lateinit var challenges: Array<String>
    override var description: String = ""

    init {
        this.loadChallenges()
        this.getRandomChallenge()
    }

    private fun getRandomChallenge(){
        val ranNum =  (0..challenges.size-1).shuffled().first()
        this.description = challenges[ranNum]
    }

    fun loadChallenges(){

        challenges = arrayOf<String>(
                "Take a sip of someones drink",
                "Do 10 push ups",
                "Roll around for 10 seconds",
                "Take off your pants for 10 seconds",
                "Plant your face on the table for 1 minute",
                "Stand in a Corner for 1 minute ",
                "Ask a stranger if you can smell their sock",
                "Cover your eyes with your hands for 1 minute",
                "Lick someones forehead",
                "Sit on the floor and meditate for 1 minute",
                "Do the downward dog for 20 seconds",
                "Pretend a stranger is an old friend you just met",
                "Convince someone they need your autograph",
                "Give someone $1 ",
                "Ask someone if they kno da wae",
                "Sing your national anthem ",
                "Call up a friend and tell them how excited you are about armpits.",
                "Kiss everyone’s knees.",
                "Gently lick the ear of the person to your left.",
                "Eat a spoonful of mustard or Tabasco sauce.",
                "Say two really nice things about every player",
                "Say the alphabet backwards as fast as possible",
                "Post a picture of your sock on facebook with caption: This is my sock",
                "Show everything that is in your wallet",
                "Remove your socks with your teeth.",
                "Eat a whole piece of paper.",
                "Get into a debate with a wall.",
                "Stand up and do jumping jacks until your next turn.",
                "Call a random number and sing \"Happy Birthday.\"",
                "Kiss the person to your right on the back of their neck",
                "Snapchat a picture of your elbow and caption it: \"My favorite part of my body.\" ",
                " Tape your mouth shut.", "Make a mask on your face using wet toilet paper. ",
                "One by one, make up a title for each players’ movie about their life ",
                "Lick mayonnaise off of someone's toe.",
                "Pick up a random book and read it in the most seductive voice you can manage ",
                "Take a naked selfie and send it to your partner.")
    }
}
