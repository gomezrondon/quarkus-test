import io.quarkus.runtime.StartupEvent
import org.slf4j.LoggerFactory
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes


@ApplicationScoped
open class AppLifecycleBean {

    private val LOGGER = LoggerFactory.getLogger("ListenerBean")

    fun onStart(@Observes  ev:StartupEvent) {
        println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ")



        shutDown()
    }

    private fun shutDown() {
        Thread(Runnable {
            LOGGER.info("About to system exit.")
            System.exit(0)
        }).start()
    }

}