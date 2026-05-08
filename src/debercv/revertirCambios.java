/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debercv;

/**
 *
 * @author MSI
 */
public class revertirCambios {
    /**
    * EXPLICACION: Como revertir cambios en Git desde NetBeans
    * 
    * Existen 3 casos para revertir cambios segun el momento en que te encuentres:
    * 
    * ------------------------------------------------------------------
    * CASO 1: Revertir cambios que AUN NO tienen Commit
    * ------------------------------------------------------------------
    * Usar cuando: modificaste el codigo pero NO hiciste commit todavia
    * y quieres volver al estado del ultimo commit.
    * 
    * Pasos en NetBeans:
    *   1. Clic derecho sobre el archivo en la ventana Projects
    *   2. Seleccionar: Git > Revert Modifications
    *   3. Verificar los archivos y hacer clic en Revert
    * 
    * ADVERTENCIA: Esta accion borra tus cambios locales de forma permanente.
    * 
    * ------------------------------------------------------------------
    * CASO 2: Volver a una version anterior especifica del historial
    * ------------------------------------------------------------------
    * Usar cuando: ya tienes varios commits y quieres regresar
    * exactamente al estado de uno anterior.
    * 
    * Pasos en NetBeans:
    *   1. Clic derecho sobre el archivo o proyecto
    *   2. Seleccionar: Git > Show History
    *   3. En la lista de commits, clic derecho sobre el que deseas
    *   4. Seleccionar: Checkout Revision
    * 
    * ------------------------------------------------------------------
    * CASO 3: Revertir el ultimo commit (forma segura)
    * ------------------------------------------------------------------
    * Usar cuando: ya hiciste un commit pero fue un error y quieres
    * deshacerlo SIN borrar el historial de cambios.
    * 
    * Pasos en NetBeans:
    *   1. Ir al menu superior: Team > Show History
    *   2. Clic derecho sobre el ultimo commit
    *   3. Seleccionar: Revert Commit
    *   4. Git creara un nuevo commit que deshace los cambios anteriores
    * 
    * NOTA: Esta es la opcion mas segura porque conserva el historial
    * completo y no elimina ningun commit existente.
    * ------------------------------------------------------------------
    */ 
}
