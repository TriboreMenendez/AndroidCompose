package tribore.android.firstcomposetutorial.domain

/**
 * Created by MaksimNikulin on 30.01.2023
 */
interface MessagesRepository {
    fun getListMessages(): List<Message>
}