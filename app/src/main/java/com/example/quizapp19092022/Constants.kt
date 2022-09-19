package com.example.quizapp19092022

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Armenia",
            optionThree = "Australia",
            optionFour = "Austria",
            correctAnswer = 1
        )
        questionList.add(que1)

        val que2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_brazil,
            optionOne = "Brunei",
            optionTwo = "Brazil",
            optionThree = "Bulgaria",
            optionFour = "Bolivia",
            correctAnswer = 2
        )
        questionList.add(que2)

        val que3 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_belgium,
            optionOne = "Bhutan",
            optionTwo = "Benin",
            optionThree = "Belize",
            optionFour = "Belgium",
            correctAnswer = 4
        )
        questionList.add(que3)

        val que4 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_denmark,
            optionOne = "Bhutan",
            optionTwo = "Denmark",
            optionThree = "Belize",
            optionFour = "Belgium",
            correctAnswer = 2
        )
        questionList.add(que4)

        return questionList
    }
}