# autor: Chris
# language: es

  @historias

  Característica: pruebas en aplicativo startsharp
    @buescenario1
    Esquema del escenario: como usuario quiero crear una nueva unidad de negocio en la aplicacion startsharp
      Dado que Chris tiene una cuenta activa en la aplicacion
      Cuando  Chris se loguea correctamente en la pagina
      * da clic en organizaciones
      * da clic en unidades de negocio
      * da clic crear nueva unidad de negocio
      | nombreBu   | unidadNegocio   |
      | <nombreBu> | <unidadNegocio> |
      Entonces la unidad de negocio se crea correctamente <nombreBu>


      Ejemplos:
        | nombreBu  | unidadNegocio |
        | Testing   | test          |

    @reunionescenario1
    Esquema del escenario: el usuario desea programar una nueva reunion desde su cuenta en startsharp
      Dado que Chris tiene una cuenta activa en la aplicacion
      Cuando Chris se loguea correctamente en la pagina
      * da clic en reunion
      * da clic en reuniones
      * da clic en nueva reunion para crearla
        | unidadNegocio   | nombreMeet   | tipo   | numeroMeet   | localizacionMeet   | anfitrionMeet   | reporteroMeet   | invitadosMeet   | tipoInvitado   | estadoInvitado   | horaInicio   | horaFin   | mesInicio   | mesFin   | diaInicio   | diaFin   |
        | <unidadNegocio> | <nombreMeet> | <tipo> | <numeroMeet> | <localizacionMeet> | <anfitrionMeet> | <reporteroMeet> | <invitadosMeet> | <tipoInvitado> | <estadoInvitado> | <horaInicio> | <horaFin> | <mesInicio> | <mesFin> | <diaInicio> | <diaFin> |

      Entonces se programa correctamente la nueva reunion <nombreMeet>


      Ejemplos:
        | unidadNegocio | nombreMeet | tipo     | numeroMeet | localizacionMeet | anfitrionMeet     | reporteroMeet | invitadosMeet | tipoInvitado | estadoInvitado | horaInicio | horaFin | mesInicio | mesFin | diaInicio | diaFin |
        | test          | Planning   | Strategy | 2022       | On Site          | Christopher Brown | Dylan Clark   | Alexis Lopez  | Guest        | Attended       | 14:00      | 16:00   | Jul       | Aug    | 8         | 12     |

    




