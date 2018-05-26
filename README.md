# modelo-jvm
Repositorio de la capa de modelo para su uso en la maquina virtual de Java

# Lenguaje
Se desarrollará utilizando Kotlin 1.2 con las librerias del lenguaje y de java.

# Dependencias
Modelo-jvm requiere de las siguientes dependencias (para Gradle) para funcionar:

    compile 'io.swagger:swagger-annotations:1.5.15'
    compile 'com.squareup.okhttp:okhttp:2.7.5'
    compile 'com.squareup.okhttp:logging-interceptor:2.7.5'
    compile 'com.google.code.gson:gson:2.8.1'
    compile 'org.threeten:threetenbp:1.3.5'

# Uso en Android
## Importar
Para usar modelo-jvm en el desarrollo de una aplicación Android es necesario añadir las dependencias a Gradle y el archivo .JAR que se publica en "releases" a la carpeta "libs" (en el mismo directorio que "src"). Recuerda añadir la dependencia del .JAR en Gradle también:

    implementation files('libs/modelo-jvm.jar')
    
## Uso
Para usar los métodos de la fachada se deben llamar de la siguiente manera:
    
    cierzo.model.<method>
    
Android no permite las llamadas de red en el hilo de la UI por lo que cada una debe llamarse en otro hilo. Por ejemplo, utilizando AsyncTask.

    inner class AsyncLogin : AsyncTask<Void, Void, Boolean>() {
        override fun doInBackground(vararg params: Void?): Boolean {
            cierzo.model.login("roberto@gmail.com","12345abc")
            return true
        }
    }
    
Es importante tener en cuenta que el colector de basura de Android podría cargarse las clases Singleton (por ello se ha dejado de utilizar los "object" de Kotlin). Para ello, en la clase que extienda Application, deben referenciarse las instancias.

    public class CierzoApp extends Application {
        public UserLogged mUserLogged;
        public Session mSession;
        // Called when the application is starting, before any other application objects have been created.
        // Overriding this method is totally optional!
        @Override
        public void onCreate() {
            super.onCreate();
            mUserLogged = UserLogged.Companion.getInstance();
            mSession = Session.Companion.getInstance();
            // Required initialization logic here!
        }

        // Called by the system when the device configuration changes while your component is running.
        // Overriding this method is totally optional!
        @Override
        public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
        }

        // This is called when the overall system is running low on memory,
        // and would like actively running processes to tighten their belts.
        // Overriding this method is totally optional!
        @Override
        public void onLowMemory() {
            super.onLowMemory();
        }
    }

# Guia de estilo
Se seguirá la guia de estilo Kotlin Coding Conventions (https://kotlinlang.org/docs/reference/coding-conventions.html)
