# Caso Práctico 1: Programación Multihilo

### ¿Se mezclan las letras?
**Sí, se mezclan.**

Al ejecutar el programa, los caracteres impresos por las tres hebras aparecen intercalados de forma desordenada e impredecible, variando el patrón en cada ejecución.

### Justificación del comportamiento

1. **Planificación de la CPU:**  
   Al invocar `start()`, las hebras pasan al estado `RUNNABLE`. El planificador del sistema operativo reparte el tiempo de procesador en pequeños intervalos. Cuando el tiempo de un hilo expira, se produce un cambio de contexto, pausando una hebra y dando paso a otra.


2. **Ausencia de sincronización:**  
   La consola (`System.out`) es un recurso compartido, por lo cual ninguna hebra bloquea el recurso para sí sola durante todo el bucle, por lo que el orden final de salida indeterminado.