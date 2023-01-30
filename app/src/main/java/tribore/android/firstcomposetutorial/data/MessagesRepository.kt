package tribore.android.firstcomposetutorial.data

import tribore.android.firstcomposetutorial.domain.Message
import tribore.android.firstcomposetutorial.domain.MessagesRepository

/**
 * Created by MaksimNikulin on 30.01.2023
 */
class MessagesRepositoryImpl: MessagesRepository {
    override fun getListMessages(): List<Message> =
        listOf<Message>(
            Message(
                author = "Tribore Menendez",
                body = "Hello, men!"
            ),
            Message(
                author = "Alucard",
                body = "Hello!"
            ),
            Message(
                author = "Tribore Menendez",
                body = "How are you?"
            ),
            Message(
                author = "Alucard",
                body = "I'm fine, thanks. And you?"
            ),
            Message(
                author = "Tribore Menendez",
                body = "Is great. The conversation becomes more interesting. It's time to play with animation! You will add the ability to expand the message so that it appears longer, animating both the content size and the background color."
            ),
            Message(
                author = "Alucard",
                body = "To save this local state of the user interface."
            )
        )
}