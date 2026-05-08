/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debercv;

/**
 * Clase HacerPull
 *
 * Esta clase contiene comentarios explicativos sobre cómo realizar un pull
 * en Git para traer los cambios más recientes desde el repositorio remoto.
 *
 * @author HOME
 */
public class HacerPull {

    /*
     * ¿Qué significa hacer pull?
     *
     * Hacer pull en Git significa descargar y actualizar el proyecto local
     * con los últimos cambios que existen en el repositorio remoto, por ejemplo,
     * desde GitHub.
     *
     * El comando principal es:
     *
     * git pull
     *
     * Este comando combina dos acciones:
     *
     * 1. git fetch
     *    Descarga la información nueva del repositorio remoto.
     *
     * 2. git merge
     *    Une esos cambios descargados con la rama local actual.
     */

    /*
     * PASOS PARA HACER PULL
     *
     * 1. Abrir Git Bash, CMD o la terminal de NetBeans.
     *
     * 2. Entrar a la carpeta del proyecto:
     *
     *    cd ruta/del/proyecto
     *
     *    Ejemplo:
     *
     *    cd C:/Users/HOME/Documents/NetBeansProjects/DeberCV
     *
     * 3. Verificar en qué rama estás trabajando:
     *
     *    git branch
     *
     *    La rama actual aparecerá con un asterisco (*).
     *
     * 4. Verificar si existen cambios pendientes:
     *
     *    git status
     *
     * 5. Si no tienes cambios pendientes, puedes hacer pull:
     *
     *    git pull
     *
     * 6. Si quieres traer cambios de una rama específica, puedes usar:
     *
     *    git pull origin nombre-rama
     *
     *    Ejemplo:
     *
     *    git pull origin main
     *
     *    o:
     *
     *    git pull origin develop
     */

    /*
     * EJEMPLO COMPLETO
     *
     * Supongamos que el proyecto está en la rama main:
     *
     * git status
     * git branch
     * git pull origin main
     *
     * Con esto se actualiza el proyecto local con los cambios
     * que están en GitHub en la rama main.
     */

    /*
     * ¿Qué hacer si Git no permite hacer pull?
     *
     * Puede pasar si tienes cambios locales sin guardar.
     *
     * Primero revisa:
     *
     * git status
     *
     * Si tienes archivos modificados, puedes guardarlos con commit:
     *
     * git add .
     * git commit -m "Guardo cambios antes de hacer pull"
     * git pull
     *
     * Otra opción es guardar temporalmente los cambios:
     *
     * git stash
     * git pull
     * git stash pop
     */

    /*
     * NOTA IMPORTANTE
     *
     * Antes de hacer pull, siempre es recomendable verificar:
     *
     * - Que estás en la rama correcta.
     * - Que no tienes cambios importantes sin guardar.
     * - Que tienes conexión con el repositorio remoto.
     *
     * Para ver el repositorio remoto configurado:
     *
     * git remote -v
     */

}