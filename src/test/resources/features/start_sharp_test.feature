# autor: Chris
# language: es

  @historias
  Característica: pruebas en aplicativo startsharp

    Antecedentes:
      Dado Chris tiene una cuenta activa en la aplicacion
      Y se loguea correctamente en la pagina con sus credenciales
      | usuario | contrasena |
      | admin   | serenity   |


    @escenario1
    Esquema del escenario: crear unidad de negocio
      Cuando el se dirige a la seccion de unidades de negocio para crear una nueva unidad ingresando la informacion requerida
      | nombreBu   | unidadNegocio   |
      | <nombreBu> | <unidadNegocio> |
      Entonces la unidad de negocio <nombreBu> se crea correctamente


      Ejemplos:
        | nombreBu  | unidadNegocio |
        | Testing   | test          |

    @escenario2
    Esquema del escenario: crear nueva reunion
      Cuando el se dirige a la seccion de reuniones para agendar una nueva ingresando los parametros solicitados
        | unidadNegocio   | nombreMeet   | tipo   | numeroMeet   | localizacionMeet   | anfitrionMeet   | reporteroMeet   | invitadosMeet   | tipoInvitado   | estadoInvitado   | horaInicio   | horaFin   | mesInicio   | mesFin   | diaInicio   | diaFin   |
        | <unidadNegocio> | <nombreMeet> | <tipo> | <numeroMeet> | <localizacionMeet> | <anfitrionMeet> | <reporteroMeet> | <invitadosMeet> | <tipoInvitado> | <estadoInvitado> | <horaInicio> | <horaFin> | <mesInicio> | <mesFin> | <diaInicio> | <diaFin> |

      Entonces se agenda correctamente la nueva reunion <nombreMeet>


      Ejemplos:
        | unidadNegocio | nombreMeet | tipo     | numeroMeet | localizacionMeet | anfitrionMeet     | reporteroMeet | invitadosMeet | tipoInvitado | estadoInvitado | horaInicio | horaFin | mesInicio | mesFin | diaInicio | diaFin |
        | test          | Planning   | Strategy | 2022       | On Site          | Christopher Brown | Dylan Clark   | Alexis Lopez  | Guest        | Attended       | 14:00      | 16:00   | Jul       | Aug    | 8         | 12     |

    




