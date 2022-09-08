# Open-FaaS

Pruebas de servicios web sobre SOAP
Pruebas sobre el SOAP response
Añadir nuevos casos de prueba
Ejecución conjunta de los casos de prueba
Ejecución de una suite completa

CheckList Funcional

    Paginación  
¿La API devuelve una lista? 
¿Cuál es el tamaño de la lista? 
¿Soporta paginación? 
¿Tiene tamaño por defecto para la paginación? 
¿Puedo controlar el número de resultados que obtengo en cada página? 
¿Podría ser diferente para cada usuario? 
¿Cómo obtiene la API esta información para el usuario? 
¿Hay alguna restricción para diferentes consumidores de la API, tales como web, móvil o tableta?


    Autenticación 
¿Quién puede acceder a esta API? 
¿Cómo se autentican? 
¿Cómo se mantiene la autenticación para llamadas posteriores? 
¿Soporta múltiple sesiones para los mismos usuarios? 
¿Qué hay de varias autenticaciones desde la misma máquina? 
¿Qué debe suceder si el usuario se desconecta de un dispositivo o del navegador? 
¿Cuántas veces un usuario puede fallar la autenticación? 
¿Por cuánto tiempo autenticación permanece válida?
-- Control de acceso
--- Quien se puede conectar
--- Error si no esta permitido
--- Multiples conexiones por usuario
--- Cantidad de conexiones por corredor
--- PErsistencia de Secion
--- Cuantas veces puede fallar la utenticación
--- Tiempo de permanencia de sesión

    Parámetros / cadenas de consulta 
¿Cómo estamos enviando datos en la cadena de consulta? 
¿Cuál dato es obligatorio? 
¿Cuál es opcional? 
¿Lo está validando? 
¿Es valida para los tipos  null? 
¿Que define  que un los valores son correctos? 
¿Y si esos valores cambian? ¿Tengo que escapar de ciertos caracteres? 
¿Puedo utilizar caracteres Unicode?

    Autorización 
¿Quién puede acceder a esta API? 
¿Cómo se limita el acceso? 
¿Cómo puedo obtener acceso privilegiado? 
¿Cuál es el riesgo de que alguien obtenga acceso no autorizado? 
¿Hay jerarquía de acceso o un acceso diferente para diferentes roles? 
¿Cuántos niveles de autorizaciones hay? ¿Cómo se hace cumplir la autorización a nivel del sistema?

    Comportamiento 
¿La API se comporta como se espera? 
¿Está funcionando como fue diseñada? 
¿Está cumpliendo con las expectativas de los usuarios? 
¿Se comporta bajo la carga esperada? 
¿Qué tipo de contenido soporta? 
¿La prueba es para XML, JSON o ambos? 
¿Esta presente la cabecera?
-- Prueba de Stress


    Control de errores 
¿Retorna los códigos de error correctos? 
¿Está dando los códigos HTTP correctas? 
¿Se valida la entrada? ¿Maneja parámetros faltantes? 
¿Maneja entradas equivocadas? 
¿Se emite el error apropiado si se solicita mal el tipo de contenido? 
¿Se bloquean los usuarios después de emitir el mismo tipo de errores? 
¿Hay llamadas asíncronas – En caso afirmativo, ¿y si hay algún error en eso? ¿Se registran estos errores? 
¿Y si todo el sistema o alguna parte del sistema no está disponible, ¿cómo afectaría al usuario? ¿Qué pasa si la caída del sistema durante la transacción, ¿cómo podría recuperarse? ¿Qué error tendría que dar?

-- Pruebas de estres
-- Pruebas de seción
-- Pruebas de autorizacion
-- Pruebas de errores conocidos
-- Escenarios d eneocio
-- Pruebas de rendimiento
-- 




