/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas;

import Clases_RRHH.Actividad;
import Clases_RRHH.Actividad_Empleado;
import Clases_RRHH.Aplicacion;
import Clases_RRHH.Aplicacion_Prueba;
import Clases_RRHH.Bitacora_Empleado;
import Clases_RRHH.Contratacion;
import Clases_RRHH.Curriculum;
import Clases_RRHH.Departamento;
import Clases_RRHH.Empleado_Contratado;
import Clases_RRHH.Experiencia_Laboral;
import Clases_RRHH.Experiencia_Laboral_Detallada;
import Clases_RRHH.Medio;
import Clases_RRHH.Nivel_Academico;
import Clases_RRHH.Periodo_Prueba;
import Clases_RRHH.Puesto;
import Clases_RRHH.Referencias_Laborales;
import Clases_RRHH.Referencias_Personales;
import Clases_RRHH.Seleccion;
import Clases_RRHH.Solicitud_Empresarial;
import Clases_RRHH.Tipo_Prueba;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static Clases_RRHH.Departamento.Base_de_Datos;
import static Clases_RRHH.Departamento.Clave;
import static Clases_RRHH.Departamento.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Langas
 */
public class RRHH extends javax.swing.JFrame {

    /**
     * Creates new form Finanzas
     */
    //String [] nombres_ColumnasDepartamento = {"Id Departamento", "Nombre Departamento", "Estatus Departamento"};
    public RRHH() {
        initComponents();
        //Labels de Deparmento (Ingresar - Modificar - Eliminar - Consultar)
        Panel_DIMEC.setVisible(false);
        jPanel_MatenimientosD.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jPanel_MantenimientoExpL.setVisible(false);
        jPanel_MantenimientoSE.setVisible(false);
        jPanel_Mantenimiento_Medio.setVisible(false);
        jPanel_MantenimientoRL.setVisible(false);
        jPanel_MantenimientosRP.setVisible(false);
        jPanel_MantenimientoCV.setVisible(false);
        jPanel_MantenimientoAP.setVisible(false);
        jPanel_Tipo_Prueba.setVisible(false);
        jPanel_MantenimientoAPP.setVisible(false);
        jPanel_MantenimientoS.setVisible(false);
        jPanel_MantenimientoA.setVisible(false);
        jPanel_MantenimientoPP.setVisible(false);
        jPanel_MantenimientoC.setVisible(false);
        jPanel_MantenimientoEC.setVisible(false);
        jPanel_MantenimientoAE.setVisible(false);
        jPanel_MantenimientoBE.setVisible(false);
        jTextField_Encontraid.setVisible(false);

        //Labels de Puesto (Ingresar - Modificar - Eliminar - Consultar)
        Panel_PIMEC.setVisible(false);

        //Labels de Nivel Academico (Ingresar - Modificar - Eliminar - Consultar)
        Panel_NAIMEC.setVisible(false);

        //Labels de Experiencia Laboral Detallada (Ingresar - Modificar - Eliminar - Consultar)
        Panel_ExpLDIMEC.setVisible(false);

        //Labels de Experiencia Laboral (Ingresar - Modificar - Eliminar - Consultar)
        Panel_ExpLIMEC.setVisible(false);

        //Labels de Solicitud Empresarial (Ingresar - Modificar - Eliminar - Consultar)
        Panel_SEIMEC.setVisible(false);

        //Labels de Medio (Ingresar - Modificar - Eliminar - Consultar)
        Panel_MIMEC.setVisible(false);

        //Labels de Referencia Laboral (Ingresar - Modificar - Eliminar - Consultar)
        Panel_RLIMEC.setVisible(false);

        //Labels de Referencia Personales (Ingresar - Modificar - Eliminar - Consultar)
        Panel_RPIMEC.setVisible(false);

        //Labels de Curriculum (Ingresar - Modificar - Eliminar - Consultar)
        Panel_CVIMEC.setVisible(false);

        //Labels de Aplicacion (Ingresar - Modificar - Eliminar - Consultar)
        Panel_APIMEC.setVisible(false);

        //Labels de Aplicacion Prueba (Ingresar - Modificar - Eliminar - Consultar)
        Panel_TPIMEC.setVisible(false);

        //Labels de Aplicacion Prueba (Ingresar - Modificar - Eliminar - Consultar)
        Panel_APPIMEC.setVisible(false);

        //Labels de Seleccion (Ingresar - Modificar - Eliminar - Consultar)
        Panel_SIMEC.setVisible(false);

        //Labels de Actividad (Ingresar - Modificar - Eliminar - Consultar)
        Panel_AIMEC.setVisible(false);

        //Labels de Periodo Prueba (Ingresar - Modificar - Eliminar - Consultar)
        Panel_PPIMEC.setVisible(false);

        //Labels de Contratacion (Ingresar - Modificar - Eliminar - Consultar)
        Panel_CTIMEC.setVisible(false);
        
        //Labels de Empleado Contratado (Ingresar - Modificar - Eliminar - Consultar)
        Panel_ECTIMEC.setVisible(false);
        
        Panel_AEIMEC.setVisible(false);
        
        //Labels de Bitacora Empleadp (Consultar)
        Panel_BEIMEC.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_RRHH = new javax.swing.JPanel();
        jLabel_RRHH = new javax.swing.JLabel();
        jLabel_Departamento = new javax.swing.JLabel();
        jLabel_SolicitudE = new javax.swing.JLabel();
        Panel_PIMEC = new javax.swing.JPanel();
        jLabel_ModificarP = new javax.swing.JLabel();
        jLabel_EliminarP = new javax.swing.JLabel();
        jLabel_ConsultarP = new javax.swing.JLabel();
        jLabel_MantenimientoP = new javax.swing.JLabel();
        jLabel_Puesto = new javax.swing.JLabel();
        Panel_DIMEC = new javax.swing.JPanel();
        jLabel_ModificarD = new javax.swing.JLabel();
        jLabel_EliminarD = new javax.swing.JLabel();
        jLabel_ConsultarD = new javax.swing.JLabel();
        jLabel_MantenimientoD = new javax.swing.JLabel();
        jLabel_NivelA = new javax.swing.JLabel();
        Panel_NAIMEC = new javax.swing.JPanel();
        jLabel_ModificarA = new javax.swing.JLabel();
        jLabel_EliminarA = new javax.swing.JLabel();
        jLabel_ConsultarA = new javax.swing.JLabel();
        jLabel_MantenimientoA = new javax.swing.JLabel();
        jLabel_ExpLD = new javax.swing.JLabel();
        Panel_ExpLDIMEC = new javax.swing.JPanel();
        jLabel_ModificarExpLD = new javax.swing.JLabel();
        jLabel_EliminarExpLD = new javax.swing.JLabel();
        jLabel_ConsultarExpLD = new javax.swing.JLabel();
        jLabel_MantenimientoExpLD = new javax.swing.JLabel();
        jLabel_ExpL = new javax.swing.JLabel();
        Panel_ExpLIMEC = new javax.swing.JPanel();
        jLabel_ModificarExpL = new javax.swing.JLabel();
        jLabel_EliminarExpL = new javax.swing.JLabel();
        jLabel_ConsultarExpL = new javax.swing.JLabel();
        jLabel_MantenimientoExpL = new javax.swing.JLabel();
        Panel_SEIMEC = new javax.swing.JPanel();
        jLabel_ModificarSE = new javax.swing.JLabel();
        jLabel_EliminarSE = new javax.swing.JLabel();
        jLabel_ConsultarSE = new javax.swing.JLabel();
        jLabel_MantenimientoSE = new javax.swing.JLabel();
        jLabel_Medio = new javax.swing.JLabel();
        Panel_MIMEC = new javax.swing.JPanel();
        jLabel_Modificar_M = new javax.swing.JLabel();
        jLabel_Eliminar_M = new javax.swing.JLabel();
        jLabel_ConsultarM = new javax.swing.JLabel();
        jLabel_MantenimientoM = new javax.swing.JLabel();
        jLabel_RL = new javax.swing.JLabel();
        Panel_RLIMEC = new javax.swing.JPanel();
        jLabel_Modificar_RL = new javax.swing.JLabel();
        jLabel_Eliminar_RL = new javax.swing.JLabel();
        jLabel_Consultar_RL = new javax.swing.JLabel();
        jLabel_Mantenimiento_RL = new javax.swing.JLabel();
        jLabel_ReferenciasP = new javax.swing.JLabel();
        Panel_RPIMEC = new javax.swing.JPanel();
        jLabel_ModificarRP = new javax.swing.JLabel();
        jLabel_EliminarRP = new javax.swing.JLabel();
        jLabel_ConsultarRP = new javax.swing.JLabel();
        jLabel_MantenimientoRP = new javax.swing.JLabel();
        jLabel_CV = new javax.swing.JLabel();
        Panel_CVIMEC = new javax.swing.JPanel();
        jLabel_ModificarCV = new javax.swing.JLabel();
        jLabel_EliminarCV = new javax.swing.JLabel();
        jLabel_ConsultarCV = new javax.swing.JLabel();
        jLabel_MantenimientoCV = new javax.swing.JLabel();
        jLabel_AP = new javax.swing.JLabel();
        Panel_APIMEC = new javax.swing.JPanel();
        jLabel_ModificarAP = new javax.swing.JLabel();
        jLabel_EliminarAP = new javax.swing.JLabel();
        jLabel_ConsultarAP = new javax.swing.JLabel();
        jLabel_MantenimientoAP = new javax.swing.JLabel();
        jLabel_TipoP = new javax.swing.JLabel();
        Panel_TPIMEC = new javax.swing.JPanel();
        jLabel_ModificarTP = new javax.swing.JLabel();
        jLabel_EliminarTP = new javax.swing.JLabel();
        jLabel_ConsultarTP = new javax.swing.JLabel();
        jLabel_MantenimientoTP = new javax.swing.JLabel();
        jLabel_APP = new javax.swing.JLabel();
        Panel_APPIMEC = new javax.swing.JPanel();
        jLabel_Modificar_APP = new javax.swing.JLabel();
        jLabel_EliminarAPP = new javax.swing.JLabel();
        jLabel_ConsultarAPP = new javax.swing.JLabel();
        jLabel_Mantenimiento_APP = new javax.swing.JLabel();
        jLabel_Seleccion = new javax.swing.JLabel();
        Panel_SIMEC = new javax.swing.JPanel();
        jLabel_Modificar_Seleccion = new javax.swing.JLabel();
        jLabel_Eliminar_Seleccion = new javax.swing.JLabel();
        jLabel_Consultar_Seleccion = new javax.swing.JLabel();
        jLabel_Mantenimiento_Seleccion = new javax.swing.JLabel();
        jLabel_Actividad = new javax.swing.JLabel();
        Panel_AIMEC = new javax.swing.JPanel();
        jLabel_Modificar_A = new javax.swing.JLabel();
        jLabel_Eliminar_A = new javax.swing.JLabel();
        jLabel_Consultar_A = new javax.swing.JLabel();
        jLabel_Mantenimiento_A = new javax.swing.JLabel();
        jLabel_PeriodoP = new javax.swing.JLabel();
        Panel_PPIMEC = new javax.swing.JPanel();
        jLabel_ModificarPP = new javax.swing.JLabel();
        jLabel_EliminarPP = new javax.swing.JLabel();
        jLabel_ConsultarPP = new javax.swing.JLabel();
        jLabel_MantenimientoPP = new javax.swing.JLabel();
        jLabel_Contratacion = new javax.swing.JLabel();
        Panel_CTIMEC = new javax.swing.JPanel();
        jLabel_ModificarC = new javax.swing.JLabel();
        jLabel_EliminarC = new javax.swing.JLabel();
        jLabel_ConsultarC = new javax.swing.JLabel();
        jLabel_MantenimientoC = new javax.swing.JLabel();
        jLabel_EmpleadoC = new javax.swing.JLabel();
        Panel_ECTIMEC = new javax.swing.JPanel();
        jLabel_ModificarEC = new javax.swing.JLabel();
        jLabel_EliminarEC = new javax.swing.JLabel();
        jLabel_ConsultarEC = new javax.swing.JLabel();
        jLabel_MantenimientoEC = new javax.swing.JLabel();
        jLabel_AE = new javax.swing.JLabel();
        Panel_AEIMEC = new javax.swing.JPanel();
        jLabel_ModificarAE = new javax.swing.JLabel();
        jLabel_EliminarAE = new javax.swing.JLabel();
        jLabel_ConsultarAE = new javax.swing.JLabel();
        jLabel_MantenimientoAE = new javax.swing.JLabel();
        jLabel_BE = new javax.swing.JLabel();
        Panel_BEIMEC = new javax.swing.JPanel();
        jLabel_ConsultarBE = new javax.swing.JLabel();
        jPanel_MantenimientoBE = new javax.swing.JPanel();
        jLabel_Buscar_BE = new javax.swing.JLabel();
        txt_Buscar_BE = new javax.swing.JTextField();
        jScrollPane40 = new javax.swing.JScrollPane();
        tbl_BE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Encontraid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        txt_puesto = new javax.swing.JTextField();
        txt_depa = new javax.swing.JTextField();
        txt_peri = new javax.swing.JTextField();
        txt_selec = new javax.swing.JTextField();
        txt_ap = new javax.swing.JTextField();
        txt_idap = new javax.swing.JTextField();
        txt_dpi = new javax.swing.JTextField();
        jPanel_MantenimientoEC = new javax.swing.JPanel();
        jLabel_ID_EC = new javax.swing.JLabel();
        txt_id_EC = new javax.swing.JTextField();
        jLabel_CEC = new javax.swing.JLabel();
        jLabel_CECC = new javax.swing.JLabel();
        jComboBox_CEC = new javax.swing.JComboBox<>();
        jLabel_ECP = new javax.swing.JLabel();
        jLabel_ECPP = new javax.swing.JLabel();
        jComboBox_ECP = new javax.swing.JComboBox<>();
        jLabel_ECD = new javax.swing.JLabel();
        jLabel_ECDD = new javax.swing.JLabel();
        jComboBox_ECD = new javax.swing.JComboBox<>();
        jLabe_SEC = new javax.swing.JLabel();
        txt_SEC = new javax.swing.JTextField();
        jLabel_IngresarEC = new javax.swing.JLabel();
        jLabel_Modificar_EC = new javax.swing.JLabel();
        jLabel_Eliminar_EC = new javax.swing.JLabel();
        jLabel_BuscarEC = new javax.swing.JLabel();
        txt_BuscarEC = new javax.swing.JTextField();
        jScrollPane38 = new javax.swing.JScrollPane();
        tbl_EC = new javax.swing.JTable();
        jPanel_MantenimientoC = new javax.swing.JPanel();
        txt_id_C = new javax.swing.JTextField();
        jLabel_ID_C = new javax.swing.JLabel();
        jLabel_PPC = new javax.swing.JLabel();
        jLabel_PPCC = new javax.swing.JLabel();
        jComboBox_PPC = new javax.swing.JComboBox<>();
        txt_FC = new javax.swing.JTextField();
        jLabel_FC = new javax.swing.JLabel();
        txt_DC = new javax.swing.JTextField();
        jLabel_DC = new javax.swing.JLabel();
        txt_EC = new javax.swing.JTextField();
        jLabel_EC = new javax.swing.JLabel();
        jLabel_InsertarC = new javax.swing.JLabel();
        jLabel_Modificar_C = new javax.swing.JLabel();
        jLabel_Eliminar_C = new javax.swing.JLabel();
        jLabel_Buscar_C = new javax.swing.JLabel();
        txt_Buscar_C = new javax.swing.JTextField();
        jScrollPane37 = new javax.swing.JScrollPane();
        tbl_C = new javax.swing.JTable();
        jPanel_MantenimientoPP = new javax.swing.JPanel();
        jLabel_ID_PP = new javax.swing.JLabel();
        txt_id_PP = new javax.swing.JTextField();
        jLabel_PPS = new javax.swing.JLabel();
        jLabel_PPSE = new javax.swing.JLabel();
        jComboBox_PPS = new javax.swing.JComboBox<>();
        jLabel_FI = new javax.swing.JLabel();
        txt_id_FI = new javax.swing.JTextField();
        jLabel_FF = new javax.swing.JLabel();
        txt_id_FF = new javax.swing.JTextField();
        jLabel_Pago = new javax.swing.JLabel();
        txt_id_Pago = new javax.swing.JTextField();
        jLabel_PPA = new javax.swing.JLabel();
        jComboBox_PPA = new javax.swing.JComboBox<>();
        jLabel_PPAA = new javax.swing.JLabel();
        jLabel_IngresarPP = new javax.swing.JLabel();
        jLabel_Modificar_PP = new javax.swing.JLabel();
        jLabel_Eliminar_PP = new javax.swing.JLabel();
        jLabel_BuscarPP = new javax.swing.JLabel();
        txt_BuscarPP = new javax.swing.JTextField();
        jScrollPane36 = new javax.swing.JScrollPane();
        tbl_PP = new javax.swing.JTable();
        jPanel_MantenimientoExpLD = new javax.swing.JPanel();
        jLabel_ID_ExpLD = new javax.swing.JLabel();
        txt_id_ExpLD = new javax.swing.JTextField();
        jLabel_NombreExpLD = new javax.swing.JLabel();
        txt_NombreExpLD = new javax.swing.JTextField();
        jLabel_Nombre_EmpresaExpLD = new javax.swing.JLabel();
        txt_Nombre_EmpresaExpLD = new javax.swing.JTextField();
        jLabel_Tiempo_InicioExpLD = new javax.swing.JLabel();
        txt_Tiempo_InicioExpLD = new javax.swing.JTextField();
        jLabel_Tiempo_FinalizacionExpLD = new javax.swing.JLabel();
        txt_Tiempo_FinalizacionExpLD = new javax.swing.JTextField();
        jLabel_Insertar_ExpLD = new javax.swing.JLabel();
        jLabel_Modificar_ExpLD = new javax.swing.JLabel();
        jLabel_Eliminar_ExpLD = new javax.swing.JLabel();
        jLabel_Buscar_ExpLD = new javax.swing.JLabel();
        txt_Buscar_ExpLD = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        tbl_ExpLD = new javax.swing.JTable();
        jPanel_MantenimientosRP = new javax.swing.JPanel();
        jLabel_ID_RP = new javax.swing.JLabel();
        txt_id_RP = new javax.swing.JTextField();
        jLabel_Nombre_RP = new javax.swing.JLabel();
        txt_Nombre_RP = new javax.swing.JTextField();
        jLabel_Telefono_RP = new javax.swing.JLabel();
        txt_Telefono_RP = new javax.swing.JTextField();
        jLabel_Insertar_RP = new javax.swing.JLabel();
        jLabel_Modificar_RP = new javax.swing.JLabel();
        jLabel_Eliminar_RP = new javax.swing.JLabel();
        txt_Buscar_RP = new javax.swing.JTextField();
        jLabel_Buscar_RP = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tbl_RP = new javax.swing.JTable();
        jPanel_Tipo_Prueba = new javax.swing.JPanel();
        jLabel_Prueba = new javax.swing.JLabel();
        txt_id_TP = new javax.swing.JTextField();
        jLabel_DPIAP1 = new javax.swing.JLabel();
        jLabel_TP = new javax.swing.JLabel();
        txt_TP = new javax.swing.JTextField();
        jLabel_IngresarTP = new javax.swing.JLabel();
        jLabel_Modificar_TP = new javax.swing.JLabel();
        jLabel_Eliminar_TP = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        tbl_TP = new javax.swing.JTable();
        txt_BuscarTP = new javax.swing.JTextField();
        jLabel_BuscarTP = new javax.swing.JLabel();
        jPanel_MantenimientoNA = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        tbl_NivelA = new javax.swing.JTable();
        jLabel_ID_NivelA = new javax.swing.JLabel();
        txt_id_NivelA = new javax.swing.JTextField();
        jLabel_Nombre_NivelA = new javax.swing.JLabel();
        txt_Nombre_NivelA = new javax.swing.JTextField();
        jLabel_Descripcion_NivelA = new javax.swing.JLabel();
        txt_Descripcion_NivelA = new javax.swing.JTextField();
        jLabel_Insertar_NivelA = new javax.swing.JLabel();
        jLabel_Eliminar_NivelA = new javax.swing.JLabel();
        jLabel_Modificar_NivelA = new javax.swing.JLabel();
        jLabel_Buscar_NivelA = new javax.swing.JLabel();
        txt_Buscar_NivelA = new javax.swing.JTextField();
        jPanel_MantenimientoAP = new javax.swing.JPanel();
        txt_id_AP = new javax.swing.JTextField();
        jLabel_ID_AP = new javax.swing.JLabel();
        jLabel_DPIAP = new javax.swing.JLabel();
        jComboBox_DPIAP = new javax.swing.JComboBox<>();
        txt_RequisitosAP = new javax.swing.JTextField();
        jLabel_RequisitosAP = new javax.swing.JLabel();
        jLabel_IngresarAP = new javax.swing.JLabel();
        jLabel_Modificar_AP = new javax.swing.JLabel();
        jLabel_Eliminar_AP = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tbl_AP = new javax.swing.JTable();
        txt_BuscarAP = new javax.swing.JTextField();
        jLabel_BuscarAP = new javax.swing.JLabel();
        jLabel_DPI_AP = new javax.swing.JLabel();
        jLabel_NombreAP = new javax.swing.JLabel();
        jPanel_MantenimientoExpL = new javax.swing.JPanel();
        jLabel_ID_ExpL = new javax.swing.JLabel();
        txt_id_ExpL = new javax.swing.JTextField();
        jLabel_ID_ExpLLD = new javax.swing.JLabel();
        jLabel_id_Nombre_EpLLD = new javax.swing.JLabel();
        jLabel_Insertar_ExpL = new javax.swing.JLabel();
        jLabel_Modificar_ExpL = new javax.swing.JLabel();
        jLabel_Eliminar_ExpL = new javax.swing.JLabel();
        txt_Buscar_ExpL = new javax.swing.JTextField();
        jLabel_Buscar_ExpL = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tbl_ExpL = new javax.swing.JTable();
        jComboBox_Nombre_EpLLD = new javax.swing.JComboBox<>();
        jPanel_MatenimientosD = new javax.swing.JPanel();
        jLabel_ID_Departamento = new javax.swing.JLabel();
        txt_id_Departamento = new javax.swing.JTextField();
        jLabel_NombreD = new javax.swing.JLabel();
        txt_Nombre_Departamento = new javax.swing.JTextField();
        jLabel_Estatus_Departamento = new javax.swing.JLabel();
        txt_Estatus_Departamento = new javax.swing.JTextField();
        jLabel_Ingresar = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tbl_Departamento = new javax.swing.JTable();
        jLabel_Buscar = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        jLabel_Modificar = new javax.swing.JLabel();
        jLabel_Eliminar = new javax.swing.JLabel();
        jPanel_Mantenimiento_Medio = new javax.swing.JPanel();
        txt_id_Medio = new javax.swing.JTextField();
        jLabel_ID_Medio = new javax.swing.JLabel();
        jLabel_NombreSEM = new javax.swing.JLabel();
        jLabel_ID_SEM = new javax.swing.JLabel();
        jComboBox_IDSEM = new javax.swing.JComboBox<>();
        txt_NombreM = new javax.swing.JTextField();
        jLabel_NombreM = new javax.swing.JLabel();
        jLabel_DescripcionM = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_DescripcionM = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        tbl_Medio = new javax.swing.JTable();
        jLabel_BuscarM = new javax.swing.JLabel();
        txt_BuscarM = new javax.swing.JTextField();
        jLabel_IngresarM = new javax.swing.JLabel();
        jLabel_ModificarM = new javax.swing.JLabel();
        jLabel_EliminarM = new javax.swing.JLabel();
        jPanel_MantenimientoRL = new javax.swing.JPanel();
        txt_id_ReferenciaL = new javax.swing.JTextField();
        jLabel_ID_ReferenciaL = new javax.swing.JLabel();
        txt_NombreRL = new javax.swing.JTextField();
        jLabel_NombreRL = new javax.swing.JLabel();
        txt_TelefonoRL = new javax.swing.JTextField();
        jLabel_TelefonoRL = new javax.swing.JLabel();
        jLabel_IngresarRL = new javax.swing.JLabel();
        jLabel_ModificarRL = new javax.swing.JLabel();
        jLabel_EliminarRL = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tbl_RL = new javax.swing.JTable();
        jLabel_BuscarRL = new javax.swing.JLabel();
        txt_BuscarRL = new javax.swing.JTextField();
        jPanel_MantenimientoSE = new javax.swing.JPanel();
        jLabel_DescripcionSE = new javax.swing.JLabel();
        txt_id_SolicitudE = new javax.swing.JTextField();
        jLabel_RangoEdadM = new javax.swing.JLabel();
        txt_RangoEdadM = new javax.swing.JTextField();
        jLabel_RangoEdadMa = new javax.swing.JLabel();
        txt_RangoEdadMa = new javax.swing.JTextField();
        jLabel_RangoEdadMa1 = new javax.swing.JLabel();
        txt_Genero = new javax.swing.JTextField();
        jLabel_PuestoSE = new javax.swing.JLabel();
        jLabel_Puesto_SE = new javax.swing.JLabel();
        jComboBox_PuestoSE = new javax.swing.JComboBox<>();
        jLabel_DepartamentoSE = new javax.swing.JLabel();
        jLabel_Departamento_SE = new javax.swing.JLabel();
        jComboBox_DepartamentoSE = new javax.swing.JComboBox<>();
        jLabel_NivelASE = new javax.swing.JLabel();
        jLabel_NivelA_SE = new javax.swing.JLabel();
        jComboBox_NivelASE = new javax.swing.JComboBox<>();
        jLabel_ExperieciaLSE = new javax.swing.JLabel();
        jLabel_ExperienciaL_SE = new javax.swing.JLabel();
        jComboBox_ExperienciaL_SE = new javax.swing.JComboBox<>();
        jLabel_ID_SolicitudE1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_DescripcionSE = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        tbl_SE = new javax.swing.JTable();
        txt_Buscar_SE = new javax.swing.JTextField();
        jLabel_Buscar_SE = new javax.swing.JLabel();
        jLabel_IngresarSE = new javax.swing.JLabel();
        jLabel_Modificar_SE = new javax.swing.JLabel();
        jLabel_Eliminar_SE = new javax.swing.JLabel();
        jPanel_MantenimientoCV = new javax.swing.JPanel();
        jLabel_DPICV = new javax.swing.JLabel();
        txt_DPICV = new javax.swing.JTextField();
        jLabel_NombreCV = new javax.swing.JLabel();
        txt_NombreCV = new javax.swing.JTextField();
        jLabel_ApellidoCV = new javax.swing.JLabel();
        txt_ApellidoCV = new javax.swing.JTextField();
        jLabel_TelefonoCV = new javax.swing.JLabel();
        txt_TelefonoCV = new javax.swing.JTextField();
        jLabel_CorreoCV = new javax.swing.JLabel();
        txt_CorreoCV = new javax.swing.JTextField();
        jLabel_DireccionCV = new javax.swing.JLabel();
        txt_DireccionCV = new javax.swing.JTextField();
        jLabel_GeneroCV = new javax.swing.JLabel();
        txt_GeneroCV = new javax.swing.JTextField();
        jLabel_EdadCV = new javax.swing.JLabel();
        txt_EdadCV = new javax.swing.JTextField();
        jLabel_NivelACV = new javax.swing.JLabel();
        jComboBox_NivelACV = new javax.swing.JComboBox<>();
        jLabel_RPCV = new javax.swing.JLabel();
        jComboBox_RPCV = new javax.swing.JComboBox<>();
        jLabel_RLCV = new javax.swing.JLabel();
        jComboBox_RLCV = new javax.swing.JComboBox<>();
        jLabel_ELCV = new javax.swing.JLabel();
        jComboBox_ELCV = new javax.swing.JComboBox<>();
        jLabel_MedioCV = new javax.swing.JLabel();
        jComboBox_MedioCV = new javax.swing.JComboBox<>();
        jLabel_Insertar_CV = new javax.swing.JLabel();
        jLabel_Modificar_CV = new javax.swing.JLabel();
        jLabel_Eliminar_CV = new javax.swing.JLabel();
        jLabel_Buscar_CV = new javax.swing.JLabel();
        txt_Buscar_CV = new javax.swing.JTextField();
        jScrollPane30 = new javax.swing.JScrollPane();
        tbl_CV = new javax.swing.JTable();
        jLabel_NivelA_CV = new javax.swing.JLabel();
        jLabel_RL_CV = new javax.swing.JLabel();
        jLabel_EL_CV = new javax.swing.JLabel();
        jLabel_Correo_CV = new javax.swing.JLabel();
        jLabel_RP_CV = new javax.swing.JLabel();
        jLabel_Medio_CV = new javax.swing.JLabel();
        jPanel_MantenimientoAPP = new javax.swing.JPanel();
        jLabel_ID_APP = new javax.swing.JLabel();
        txt_id_APP = new javax.swing.JTextField();
        jLabel_PruebaAPP = new javax.swing.JLabel();
        jLabel_Prueba_APP = new javax.swing.JLabel();
        jComboBox_PruebaAPP = new javax.swing.JComboBox<>();
        jLabel_AplicacionAPP = new javax.swing.JLabel();
        jLabel_Aplicacion_APP = new javax.swing.JLabel();
        jComboBox_AplicacionAPP = new javax.swing.JComboBox<>();
        jLabel_EstatusAPP = new javax.swing.JLabel();
        txt_AplicacionAPP = new javax.swing.JTextField();
        jLabel_Ingresar_APP = new javax.swing.JLabel();
        jLabel_ModificarAPP = new javax.swing.JLabel();
        jLabel_Eliminar_APP = new javax.swing.JLabel();
        jLabel_Buscar_APP = new javax.swing.JLabel();
        txt_Buscar_APP = new javax.swing.JTextField();
        jScrollPane33 = new javax.swing.JScrollPane();
        tbl_APP = new javax.swing.JTable();
        jPanel_MantenimientoS = new javax.swing.JPanel();
        jLabel_IDS = new javax.swing.JLabel();
        txt_idS = new javax.swing.JTextField();
        jLabel_APPS = new javax.swing.JLabel();
        jComboBox_APPS = new javax.swing.JComboBox<>();
        jLabel_RL_APPS = new javax.swing.JLabel();
        jLabel_EstatusS = new javax.swing.JLabel();
        txt_EstatusS = new javax.swing.JTextField();
        jLabel_InsertarS = new javax.swing.JLabel();
        jLabel_ModificarS = new javax.swing.JLabel();
        jLabel_EliminarS = new javax.swing.JLabel();
        jLabel_BuscarS = new javax.swing.JLabel();
        txt_BuscarS = new javax.swing.JTextField();
        jScrollPane34 = new javax.swing.JScrollPane();
        tbl_S = new javax.swing.JTable();
        jPanel_MantenimientoA = new javax.swing.JPanel();
        jLabel_ID_A = new javax.swing.JLabel();
        txt_id_A = new javax.swing.JTextField();
        jLabel_TA = new javax.swing.JLabel();
        txt_TA = new javax.swing.JTextField();
        jLabel_DescripcionA = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_DescripcionA = new javax.swing.JTextArea();
        jLabel_Insertar_A = new javax.swing.JLabel();
        jLabel_Modificar_Ac = new javax.swing.JLabel();
        jLabel_Eliminar_Ac = new javax.swing.JLabel();
        jLabel_BuscarA = new javax.swing.JLabel();
        txt_BuscarA = new javax.swing.JTextField();
        jScrollPane35 = new javax.swing.JScrollPane();
        tbl_A = new javax.swing.JTable();
        jPanel_MantenimientoAE = new javax.swing.JPanel();
        jLabel_AE_EC = new javax.swing.JLabel();
        jLabel_AE_ECC = new javax.swing.JLabel();
        jComboBox_AE_EC = new javax.swing.JComboBox<>();
        jLabel_Actividad_AE = new javax.swing.JLabel();
        jLabel_Actividad_AEE = new javax.swing.JLabel();
        jComboBox_Actividad_AE = new javax.swing.JComboBox<>();
        jLabel_Insertar_AE = new javax.swing.JLabel();
        jLabel_Modificar_AE = new javax.swing.JLabel();
        jLabel_Eliminar_AE = new javax.swing.JLabel();
        jLabel_BuscarAE = new javax.swing.JLabel();
        txt_BuscarAE = new javax.swing.JTextField();
        jScrollPane39 = new javax.swing.JScrollPane();
        tbl_AE = new javax.swing.JTable();
        jPanel_MantenimientosP = new javax.swing.JPanel();
        jLabel_ID_Puesto = new javax.swing.JLabel();
        txt_id_Puesto = new javax.swing.JTextField();
        jLabel_Nombre_Puesto = new javax.swing.JLabel();
        txt_Nombre_Puesto = new javax.swing.JTextField();
        jLabel_Descripcion_Puesto = new javax.swing.JLabel();
        jLabel_Descripcion_Puesto1 = new javax.swing.JLabel();
        txt_Estatus_Puesto = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        tbl_Puesto = new javax.swing.JTable();
        jLabel_Buscar_Puesto = new javax.swing.JLabel();
        txt_Buscar_Puesto = new javax.swing.JTextField();
        jLabel_Insertar_Puesto = new javax.swing.JLabel();
        jLabel_Modificar_Puesto = new javax.swing.JLabel();
        jLabel_Eliminar_Puesto = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_Descripcion_Puesto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_RRHH.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_RRHH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_RRHH.setText("RRHH");
        jPanel_RRHH.add(jLabel_RRHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel_Departamento.setText("Departamento");
        jLabel_Departamento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_DepartamentoMouseMoved(evt);
            }
        });
        jLabel_Departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DepartamentoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_DepartamentoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_DepartamentoMousePressed(evt);
            }
        });
        jPanel_RRHH.add(jLabel_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_SolicitudE.setText("Solicitud Empresarial");
        jLabel_SolicitudE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_SolicitudEMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_SolicitudE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, 20));

        Panel_PIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_PIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_PIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_PIMECMouseDragged(evt);
            }
        });
        Panel_PIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_PIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_PIMECMouseReleased(evt);
            }
        });
        Panel_PIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarP.setText("Modificar Puesto");
        jLabel_ModificarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarPMouseMoved(evt);
            }
        });
        jLabel_ModificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarPMouseExited(evt);
            }
        });
        Panel_PIMEC.add(jLabel_ModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarP.setText("Eliminar Puesto");
        jLabel_EliminarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarPMouseMoved(evt);
            }
        });
        jLabel_EliminarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarPMouseExited(evt);
            }
        });
        Panel_PIMEC.add(jLabel_EliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarP.setText("Consultar Puesto");
        jLabel_ConsultarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarPMouseMoved(evt);
            }
        });
        jLabel_ConsultarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarPMouseExited(evt);
            }
        });
        Panel_PIMEC.add(jLabel_ConsultarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoP.setText("Mantenimientos Puesto");
        jLabel_MantenimientoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPMouseMoved(evt);
            }
        });
        jLabel_MantenimientoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPMouseExited(evt);
            }
        });
        Panel_PIMEC.add(jLabel_MantenimientoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, -1));

        jPanel_RRHH.add(Panel_PIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 140, 100));

        jLabel_Puesto.setText("Puesto");
        jLabel_Puesto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_PuestoMouseMoved(evt);
            }
        });
        jLabel_Puesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PuestoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PuestoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_PuestoMousePressed(evt);
            }
        });
        jPanel_RRHH.add(jLabel_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        Panel_DIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_DIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_DIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_DIMECMouseDragged(evt);
            }
        });
        Panel_DIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_DIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_DIMECMouseReleased(evt);
            }
        });
        Panel_DIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarD.setText("Modificar Departamento");
        jLabel_ModificarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarDMouseMoved(evt);
            }
        });
        jLabel_ModificarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarDMouseExited(evt);
            }
        });
        Panel_DIMEC.add(jLabel_ModificarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarD.setText("Eliminar Departamento");
        jLabel_EliminarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarDMouseMoved(evt);
            }
        });
        jLabel_EliminarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarDMouseExited(evt);
            }
        });
        Panel_DIMEC.add(jLabel_EliminarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarD.setText("Consultar Departamento");
        jLabel_ConsultarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarDMouseMoved(evt);
            }
        });
        jLabel_ConsultarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarDMouseExited(evt);
            }
        });
        Panel_DIMEC.add(jLabel_ConsultarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoD.setText("Mantenimientos Departamento");
        jLabel_MantenimientoD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoDMouseMoved(evt);
            }
        });
        jLabel_MantenimientoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoDMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoDMouseExited(evt);
            }
        });
        Panel_DIMEC.add(jLabel_MantenimientoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        jPanel_RRHH.add(Panel_DIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 100));

        jLabel_NivelA.setText("Nivel Academico");
        jLabel_NivelA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_NivelAMouseMoved(evt);
            }
        });
        jLabel_NivelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NivelAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_NivelAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_NivelAMousePressed(evt);
            }
        });
        jPanel_RRHH.add(jLabel_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        Panel_NAIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_NAIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_NAIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_NAIMECMouseDragged(evt);
            }
        });
        Panel_NAIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_NAIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_NAIMECMouseReleased(evt);
            }
        });
        Panel_NAIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarA.setText("Modificar Nivel Academico");
        jLabel_ModificarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAMouseMoved(evt);
            }
        });
        jLabel_ModificarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAMouseExited(evt);
            }
        });
        Panel_NAIMEC.add(jLabel_ModificarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarA.setText("Eliminar Nivel Academico");
        jLabel_EliminarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAMouseMoved(evt);
            }
        });
        jLabel_EliminarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAMouseExited(evt);
            }
        });
        Panel_NAIMEC.add(jLabel_EliminarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarA.setText("Consultar Nivel Academico");
        jLabel_ConsultarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAMouseMoved(evt);
            }
        });
        jLabel_ConsultarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAMouseExited(evt);
            }
        });
        Panel_NAIMEC.add(jLabel_ConsultarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoA.setText("Mantenimientos Nivel Academico");
        jLabel_MantenimientoA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAMouseMoved(evt);
            }
        });
        jLabel_MantenimientoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAMouseExited(evt);
            }
        });
        Panel_NAIMEC.add(jLabel_MantenimientoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, -1));

        jPanel_RRHH.add(Panel_NAIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 200, 100));

        jLabel_ExpLD.setText("Experiencia Laboral Detallada");
        jLabel_ExpLD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ExpLDMouseMoved(evt);
            }
        });
        jLabel_ExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ExpLDMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ExpLDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_ExpLDMousePressed(evt);
            }
        });
        jPanel_RRHH.add(jLabel_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        Panel_ExpLDIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ExpLDIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_ExpLDIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_ExpLDIMECMouseDragged(evt);
            }
        });
        Panel_ExpLDIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ExpLDIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_ExpLDIMECMouseReleased(evt);
            }
        });
        Panel_ExpLDIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarExpLD.setText("Modificar Experiencia Laboral Detallada");
        jLabel_ModificarExpLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarExpLD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarExpLDMouseMoved(evt);
            }
        });
        jLabel_ModificarExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarExpLDMouseExited(evt);
            }
        });
        Panel_ExpLDIMEC.add(jLabel_ModificarExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarExpLD.setText("Eliminar Experiencia Laboral Detallada");
        jLabel_EliminarExpLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarExpLD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarExpLDMouseMoved(evt);
            }
        });
        jLabel_EliminarExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarExpLDMouseExited(evt);
            }
        });
        Panel_ExpLDIMEC.add(jLabel_EliminarExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarExpLD.setText("Consultar Experiencia Laboral Detallada");
        jLabel_ConsultarExpLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarExpLD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarExpLDMouseMoved(evt);
            }
        });
        jLabel_ConsultarExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarExpLDMouseExited(evt);
            }
        });
        Panel_ExpLDIMEC.add(jLabel_ConsultarExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoExpLD.setText("Mantenimientos Experiencia Laboral Detallada");
        jLabel_MantenimientoExpLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoExpLD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoExpLDMouseMoved(evt);
            }
        });
        jLabel_MantenimientoExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoExpLDMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoExpLDMouseExited(evt);
            }
        });
        Panel_ExpLDIMEC.add(jLabel_MantenimientoExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 270, -1));

        jPanel_RRHH.add(Panel_ExpLDIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 270, 100));

        jLabel_ExpL.setText("Experiencia Laboral");
        jLabel_ExpL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ExpLMouseMoved(evt);
            }
        });
        jLabel_ExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ExpLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ExpLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_ExpLMousePressed(evt);
            }
        });
        jPanel_RRHH.add(jLabel_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        Panel_ExpLIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ExpLIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_ExpLIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_ExpLIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_ExpLIMECMouseMoved(evt);
            }
        });
        Panel_ExpLIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ExpLIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_ExpLIMECMouseReleased(evt);
            }
        });
        Panel_ExpLIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarExpL.setText("Modificar Experiencia Laboral");
        jLabel_ModificarExpL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarExpL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarExpLMouseMoved(evt);
            }
        });
        jLabel_ModificarExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarExpLMouseExited(evt);
            }
        });
        Panel_ExpLIMEC.add(jLabel_ModificarExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarExpL.setText("Eliminar Experiencia Laboral");
        jLabel_EliminarExpL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarExpL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarExpLMouseMoved(evt);
            }
        });
        jLabel_EliminarExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarExpLMouseExited(evt);
            }
        });
        Panel_ExpLIMEC.add(jLabel_EliminarExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarExpL.setText("Consultar Experiencia Laboral");
        jLabel_ConsultarExpL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarExpL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarExpLMouseMoved(evt);
            }
        });
        jLabel_ConsultarExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarExpLMouseExited(evt);
            }
        });
        Panel_ExpLIMEC.add(jLabel_ConsultarExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoExpL.setText("Mantenimientos Experiencia Laboral");
        jLabel_MantenimientoExpL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoExpL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoExpLMouseMoved(evt);
            }
        });
        jLabel_MantenimientoExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoExpLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoExpLMouseExited(evt);
            }
        });
        Panel_ExpLIMEC.add(jLabel_MantenimientoExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, -1));

        jPanel_RRHH.add(Panel_ExpLIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, 100));

        Panel_SEIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_SEIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_SEIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_SEIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_SEIMECMouseMoved(evt);
            }
        });
        Panel_SEIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_SEIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_SEIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_SEIMECMouseReleased(evt);
            }
        });
        Panel_SEIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarSE.setText("Modificar Experiencia Laboral");
        jLabel_ModificarSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarSE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarSEMouseMoved(evt);
            }
        });
        jLabel_ModificarSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarSEMouseExited(evt);
            }
        });
        Panel_SEIMEC.add(jLabel_ModificarSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarSE.setText("Eliminar Experiencia Laboral");
        jLabel_EliminarSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarSE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarSEMouseMoved(evt);
            }
        });
        jLabel_EliminarSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarSEMouseExited(evt);
            }
        });
        Panel_SEIMEC.add(jLabel_EliminarSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarSE.setText("Consultar Experiencia Laboral");
        jLabel_ConsultarSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarSE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarSEMouseMoved(evt);
            }
        });
        jLabel_ConsultarSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarSEMouseExited(evt);
            }
        });
        Panel_SEIMEC.add(jLabel_ConsultarSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoSE.setText("Mantenimientos Solicitud Empresarial");
        jLabel_MantenimientoSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoSE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoSEMouseMoved(evt);
            }
        });
        jLabel_MantenimientoSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoSEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoSEMouseExited(evt);
            }
        });
        Panel_SEIMEC.add(jLabel_MantenimientoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, -1));

        jPanel_RRHH.add(Panel_SEIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 220, 90));

        jLabel_Medio.setText("Medio");
        jLabel_Medio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MedioMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, 20));

        Panel_MIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_MIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_MIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_MIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_MIMECMouseMoved(evt);
            }
        });
        Panel_MIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_MIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_MIMECMouseReleased(evt);
            }
        });
        Panel_MIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Modificar_M.setText("Modificar Medio");
        jLabel_Modificar_M.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Modificar_M.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_MMouseMoved(evt);
            }
        });
        jLabel_Modificar_M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_MMouseExited(evt);
            }
        });
        Panel_MIMEC.add(jLabel_Modificar_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_Eliminar_M.setText("Eliminar Medio");
        jLabel_Eliminar_M.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Eliminar_M.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_MMouseMoved(evt);
            }
        });
        jLabel_Eliminar_M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_MMouseExited(evt);
            }
        });
        Panel_MIMEC.add(jLabel_Eliminar_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarM.setText("Consultar Medio");
        jLabel_ConsultarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarM.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarMMouseMoved(evt);
            }
        });
        jLabel_ConsultarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarMMouseExited(evt);
            }
        });
        Panel_MIMEC.add(jLabel_ConsultarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoM.setText("Mantenimientos Medio");
        jLabel_MantenimientoM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoM.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoMMouseMoved(evt);
            }
        });
        jLabel_MantenimientoM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoMMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoMMouseExited(evt);
            }
        });
        Panel_MIMEC.add(jLabel_MantenimientoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        jPanel_RRHH.add(Panel_MIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 130, 90));

        jLabel_RL.setText("Referencias Laborales");
        jLabel_RL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_RLMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_RL, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, 20));

        Panel_RLIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_RLIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_RLIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_RLIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_RLIMECMouseMoved(evt);
            }
        });
        Panel_RLIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_RLIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_RLIMECMouseReleased(evt);
            }
        });
        Panel_RLIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Modificar_RL.setText("Modificar Referencias Laborales");
        jLabel_Modificar_RL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Modificar_RL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_RLMouseMoved(evt);
            }
        });
        jLabel_Modificar_RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_RLMouseExited(evt);
            }
        });
        Panel_RLIMEC.add(jLabel_Modificar_RL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_Eliminar_RL.setText("Eliminar Referencias Laborales");
        jLabel_Eliminar_RL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Eliminar_RL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_RLMouseMoved(evt);
            }
        });
        jLabel_Eliminar_RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_RLMouseExited(evt);
            }
        });
        Panel_RLIMEC.add(jLabel_Eliminar_RL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_Consultar_RL.setText("Consultar Referencias Laborales");
        jLabel_Consultar_RL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Consultar_RL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Consultar_RLMouseMoved(evt);
            }
        });
        jLabel_Consultar_RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Consultar_RLMouseExited(evt);
            }
        });
        Panel_RLIMEC.add(jLabel_Consultar_RL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_Mantenimiento_RL.setText("Mantenimientos Referencias Laborales");
        jLabel_Mantenimiento_RL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Mantenimiento_RL.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_RLMouseMoved(evt);
            }
        });
        jLabel_Mantenimiento_RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_RLMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_RLMouseExited(evt);
            }
        });
        Panel_RLIMEC.add(jLabel_Mantenimiento_RL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, -1));

        jPanel_RRHH.add(Panel_RLIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 230, 90));

        jLabel_ReferenciasP.setText("Referencias Personales");
        jLabel_ReferenciasP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ReferenciasPMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_ReferenciasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        Panel_RPIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_RPIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_RPIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_RPIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_RPIMECMouseMoved(evt);
            }
        });
        Panel_RPIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_RPIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_RPIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_RPIMECMouseReleased(evt);
            }
        });
        Panel_RPIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarRP.setText("Modificar Referencias Personales");
        jLabel_ModificarRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarRP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarRPMouseMoved(evt);
            }
        });
        jLabel_ModificarRP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarRPMouseExited(evt);
            }
        });
        Panel_RPIMEC.add(jLabel_ModificarRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarRP.setText("Eliminar Referencias Personales");
        jLabel_EliminarRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarRP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarRPMouseMoved(evt);
            }
        });
        jLabel_EliminarRP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarRPMouseExited(evt);
            }
        });
        Panel_RPIMEC.add(jLabel_EliminarRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarRP.setText("Consultar Referencias Personales");
        jLabel_ConsultarRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarRP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarRPMouseMoved(evt);
            }
        });
        jLabel_ConsultarRP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarRPMouseExited(evt);
            }
        });
        Panel_RPIMEC.add(jLabel_ConsultarRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoRP.setText("Mantenimientos Referencias Personales");
        jLabel_MantenimientoRP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoRP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoRPMouseMoved(evt);
            }
        });
        jLabel_MantenimientoRP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoRPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoRPMouseExited(evt);
            }
        });
        jLabel_MantenimientoRP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel_MantenimientoRPKeyPressed(evt);
            }
        });
        Panel_RPIMEC.add(jLabel_MantenimientoRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jPanel_RRHH.add(Panel_RPIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 240, 90));

        jLabel_CV.setText("Curriculum");
        jLabel_CV.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_CVMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, 20));

        Panel_CVIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_CVIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_CVIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_CVIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_CVIMECMouseMoved(evt);
            }
        });
        Panel_CVIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CVIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CVIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_CVIMECMouseReleased(evt);
            }
        });
        Panel_CVIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarCV.setText("Modificar Curriculum");
        jLabel_ModificarCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarCV.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarCVMouseMoved(evt);
            }
        });
        jLabel_ModificarCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarCVMouseExited(evt);
            }
        });
        Panel_CVIMEC.add(jLabel_ModificarCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarCV.setText("Eliminar Curriculum");
        jLabel_EliminarCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarCV.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarCVMouseMoved(evt);
            }
        });
        jLabel_EliminarCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarCVMouseExited(evt);
            }
        });
        Panel_CVIMEC.add(jLabel_EliminarCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarCV.setText("Consultar Curriculum");
        jLabel_ConsultarCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarCV.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarCVMouseMoved(evt);
            }
        });
        jLabel_ConsultarCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarCVMouseExited(evt);
            }
        });
        Panel_CVIMEC.add(jLabel_ConsultarCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoCV.setText("Mantenimientos Curriculum");
        jLabel_MantenimientoCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoCV.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoCVMouseMoved(evt);
            }
        });
        jLabel_MantenimientoCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoCVMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoCVMouseExited(evt);
            }
        });
        Panel_CVIMEC.add(jLabel_MantenimientoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, -1));

        jPanel_RRHH.add(Panel_CVIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 170, 90));

        jLabel_AP.setText("Aplicacion");
        jLabel_AP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_APMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, 20));

        Panel_APIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_APIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_APIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_APIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_APIMECMouseMoved(evt);
            }
        });
        Panel_APIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_APIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_APIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_APIMECMouseReleased(evt);
            }
        });
        Panel_APIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarAP.setText("Modificar Aplicacion");
        jLabel_ModificarAP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarAP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAPMouseMoved(evt);
            }
        });
        jLabel_ModificarAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAPMouseExited(evt);
            }
        });
        Panel_APIMEC.add(jLabel_ModificarAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarAP.setText("Eliminar Aplicacion");
        jLabel_EliminarAP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarAP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAPMouseMoved(evt);
            }
        });
        jLabel_EliminarAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAPMouseExited(evt);
            }
        });
        Panel_APIMEC.add(jLabel_EliminarAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarAP.setText("Consultar Aplicacion");
        jLabel_ConsultarAP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarAP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAPMouseMoved(evt);
            }
        });
        jLabel_ConsultarAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAPMouseExited(evt);
            }
        });
        Panel_APIMEC.add(jLabel_ConsultarAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoAP.setText("Mantenimientos Aplicacion");
        jLabel_MantenimientoAP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoAP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAPMouseMoved(evt);
            }
        });
        jLabel_MantenimientoAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAPMouseExited(evt);
            }
        });
        Panel_APIMEC.add(jLabel_MantenimientoAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, -1));

        jPanel_RRHH.add(Panel_APIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 170, 90));

        jLabel_TipoP.setText("Tipo Prueba");
        jLabel_TipoP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_TipoPMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_TipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, -1, 20));

        Panel_TPIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_TPIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_TPIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_TPIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_TPIMECMouseMoved(evt);
            }
        });
        Panel_TPIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_TPIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_TPIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_TPIMECMouseReleased(evt);
            }
        });
        Panel_TPIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarTP.setText("Modificar Tipo Prueba");
        jLabel_ModificarTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarTP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarTPMouseMoved(evt);
            }
        });
        jLabel_ModificarTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarTPMouseExited(evt);
            }
        });
        Panel_TPIMEC.add(jLabel_ModificarTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarTP.setText("Eliminar Tipo Prueba");
        jLabel_EliminarTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarTP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarTPMouseMoved(evt);
            }
        });
        jLabel_EliminarTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarTPMouseExited(evt);
            }
        });
        Panel_TPIMEC.add(jLabel_EliminarTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarTP.setText("Consultar Tipo Prueba");
        jLabel_ConsultarTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarTP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarTPMouseMoved(evt);
            }
        });
        jLabel_ConsultarTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarTPMouseExited(evt);
            }
        });
        Panel_TPIMEC.add(jLabel_ConsultarTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoTP.setText("Mantenimientos Tipo Prueba");
        jLabel_MantenimientoTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoTP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoTPMouseMoved(evt);
            }
        });
        jLabel_MantenimientoTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoTPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoTPMouseExited(evt);
            }
        });
        Panel_TPIMEC.add(jLabel_MantenimientoTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        jPanel_RRHH.add(Panel_TPIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, 200, 90));

        jLabel_APP.setText("Aplicacion Prueba");
        jLabel_APP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_APPMouseMoved(evt);
            }
        });
        jPanel_RRHH.add(jLabel_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 20));

        Panel_APPIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_APPIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_APPIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_APPIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_APPIMECMouseMoved(evt);
            }
        });
        Panel_APPIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_APPIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_APPIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_APPIMECMouseReleased(evt);
            }
        });
        Panel_APPIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Modificar_APP.setText("Modificar Aplicacion Prueba");
        jLabel_Modificar_APP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Modificar_APP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_APPMouseMoved(evt);
            }
        });
        jLabel_Modificar_APP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_APPMouseExited(evt);
            }
        });
        Panel_APPIMEC.add(jLabel_Modificar_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarAPP.setText("Eliminar Aplicacion Prueba");
        jLabel_EliminarAPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarAPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAPPMouseMoved(evt);
            }
        });
        jLabel_EliminarAPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAPPMouseExited(evt);
            }
        });
        Panel_APPIMEC.add(jLabel_EliminarAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarAPP.setText("Consultar Aplicacion Prueba");
        jLabel_ConsultarAPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarAPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAPPMouseMoved(evt);
            }
        });
        jLabel_ConsultarAPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAPPMouseExited(evt);
            }
        });
        Panel_APPIMEC.add(jLabel_ConsultarAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_Mantenimiento_APP.setText("Mantenimientos Aplicacion Prueba");
        jLabel_Mantenimiento_APP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Mantenimiento_APP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_APPMouseMoved(evt);
            }
        });
        jLabel_Mantenimiento_APP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_APPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_APPMouseExited(evt);
            }
        });
        Panel_APPIMEC.add(jLabel_Mantenimiento_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, -1));

        jPanel_RRHH.add(Panel_APPIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 200, 90));

        jLabel_Seleccion.setText("Seleccion");
        jLabel_Seleccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_SeleccionMouseMoved(evt);
            }
        });
        jLabel_Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SeleccionMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, 20));

        Panel_SIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_SIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_SIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_SIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_SIMECMouseMoved(evt);
            }
        });
        Panel_SIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_SIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_SIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_SIMECMouseReleased(evt);
            }
        });
        Panel_SIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Modificar_Seleccion.setText("Modificar Seleccion");
        jLabel_Modificar_Seleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Modificar_Seleccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_SeleccionMouseMoved(evt);
            }
        });
        jLabel_Modificar_Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_SeleccionMouseExited(evt);
            }
        });
        Panel_SIMEC.add(jLabel_Modificar_Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_Eliminar_Seleccion.setText("Eliminar Seleccion");
        jLabel_Eliminar_Seleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Eliminar_Seleccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_SeleccionMouseMoved(evt);
            }
        });
        jLabel_Eliminar_Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_SeleccionMouseExited(evt);
            }
        });
        Panel_SIMEC.add(jLabel_Eliminar_Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_Consultar_Seleccion.setText("Consultar Seleccion");
        jLabel_Consultar_Seleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Consultar_Seleccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Consultar_SeleccionMouseMoved(evt);
            }
        });
        jLabel_Consultar_Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Consultar_SeleccionMouseExited(evt);
            }
        });
        Panel_SIMEC.add(jLabel_Consultar_Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_Mantenimiento_Seleccion.setText("Mantenimientos Seleccion");
        jLabel_Mantenimiento_Seleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Mantenimiento_Seleccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_SeleccionMouseMoved(evt);
            }
        });
        jLabel_Mantenimiento_Seleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_SeleccionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_SeleccionMouseExited(evt);
            }
        });
        Panel_SIMEC.add(jLabel_Mantenimiento_Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, -1));

        jPanel_RRHH.add(Panel_SIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 160, 90));

        jLabel_Actividad.setText("Actividad");
        jLabel_Actividad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ActividadMouseMoved(evt);
            }
        });
        jLabel_Actividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ActividadMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_Actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, 20));

        Panel_AIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_AIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_AIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_AIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_AIMECMouseMoved(evt);
            }
        });
        Panel_AIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_AIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_AIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_AIMECMouseReleased(evt);
            }
        });
        Panel_AIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Modificar_A.setText("Modificar Actividad");
        jLabel_Modificar_A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Modificar_A.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_AMouseMoved(evt);
            }
        });
        jLabel_Modificar_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_AMouseExited(evt);
            }
        });
        Panel_AIMEC.add(jLabel_Modificar_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_Eliminar_A.setText("Eliminar Actividad");
        jLabel_Eliminar_A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Eliminar_A.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_AMouseMoved(evt);
            }
        });
        jLabel_Eliminar_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_AMouseExited(evt);
            }
        });
        Panel_AIMEC.add(jLabel_Eliminar_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_Consultar_A.setText("Consultar Actividad");
        jLabel_Consultar_A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Consultar_A.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Consultar_AMouseMoved(evt);
            }
        });
        jLabel_Consultar_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Consultar_AMouseExited(evt);
            }
        });
        Panel_AIMEC.add(jLabel_Consultar_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_Mantenimiento_A.setText("Mantenimientos Actividad");
        jLabel_Mantenimiento_A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Mantenimiento_A.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_AMouseMoved(evt);
            }
        });
        jLabel_Mantenimiento_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_AMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Mantenimiento_AMouseExited(evt);
            }
        });
        Panel_AIMEC.add(jLabel_Mantenimiento_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, -1));

        jPanel_RRHH.add(Panel_AIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 160, 90));

        jLabel_PeriodoP.setText("Periodo Prueba");
        jLabel_PeriodoP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_PeriodoPMouseMoved(evt);
            }
        });
        jLabel_PeriodoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PeriodoPMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_PeriodoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, 20));

        Panel_PPIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_PPIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_PPIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_PPIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_PPIMECMouseMoved(evt);
            }
        });
        Panel_PPIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_PPIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_PPIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_PPIMECMouseReleased(evt);
            }
        });
        Panel_PPIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarPP.setText("Modificar Periodo Prueba");
        jLabel_ModificarPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarPPMouseMoved(evt);
            }
        });
        jLabel_ModificarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarPPMouseExited(evt);
            }
        });
        Panel_PPIMEC.add(jLabel_ModificarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarPP.setText("Eliminar Periodo Prueba");
        jLabel_EliminarPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarPPMouseMoved(evt);
            }
        });
        jLabel_EliminarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarPPMouseExited(evt);
            }
        });
        Panel_PPIMEC.add(jLabel_EliminarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarPP.setText("Consultar Periodo Prueba");
        jLabel_ConsultarPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarPPMouseMoved(evt);
            }
        });
        jLabel_ConsultarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarPPMouseExited(evt);
            }
        });
        Panel_PPIMEC.add(jLabel_ConsultarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoPP.setText("Mantenimientos Periodo Prueba");
        jLabel_MantenimientoPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoPP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPPMouseMoved(evt);
            }
        });
        jLabel_MantenimientoPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoPPMouseExited(evt);
            }
        });
        Panel_PPIMEC.add(jLabel_MantenimientoPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, -1));

        jPanel_RRHH.add(Panel_PPIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 190, 90));

        jLabel_Contratacion.setText("Contratacion");
        jLabel_Contratacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ContratacionMouseMoved(evt);
            }
        });
        jLabel_Contratacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ContratacionMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_Contratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, 20));

        Panel_CTIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_CTIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_CTIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_CTIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_CTIMECMouseMoved(evt);
            }
        });
        Panel_CTIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CTIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CTIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_CTIMECMouseReleased(evt);
            }
        });
        Panel_CTIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarC.setText("Modificar Contratacion");
        jLabel_ModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarCMouseMoved(evt);
            }
        });
        jLabel_ModificarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarCMouseExited(evt);
            }
        });
        Panel_CTIMEC.add(jLabel_ModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarC.setText("Eliminar Contratacion");
        jLabel_EliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarCMouseMoved(evt);
            }
        });
        jLabel_EliminarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarCMouseExited(evt);
            }
        });
        Panel_CTIMEC.add(jLabel_EliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarC.setText("Consultar Contratacion");
        jLabel_ConsultarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarCMouseMoved(evt);
            }
        });
        jLabel_ConsultarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarCMouseExited(evt);
            }
        });
        Panel_CTIMEC.add(jLabel_ConsultarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoC.setText("Mantenimientos Contratacion");
        jLabel_MantenimientoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoCMouseMoved(evt);
            }
        });
        jLabel_MantenimientoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoCMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoCMouseExited(evt);
            }
        });
        Panel_CTIMEC.add(jLabel_MantenimientoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        jPanel_RRHH.add(Panel_CTIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 170, 90));

        jLabel_EmpleadoC.setText("Empleado Contratado");
        jLabel_EmpleadoC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EmpleadoCMouseMoved(evt);
            }
        });
        jLabel_EmpleadoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmpleadoCMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_EmpleadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, 20));

        Panel_ECTIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ECTIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_ECTIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_ECTIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_ECTIMECMouseMoved(evt);
            }
        });
        Panel_ECTIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_ECTIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ECTIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_ECTIMECMouseReleased(evt);
            }
        });
        Panel_ECTIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarEC.setText("Modificar Empleado Contratado");
        jLabel_ModificarEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarECMouseMoved(evt);
            }
        });
        jLabel_ModificarEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarECMouseExited(evt);
            }
        });
        Panel_ECTIMEC.add(jLabel_ModificarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarEC.setText("Eliminar Empleado Contratado");
        jLabel_EliminarEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarECMouseMoved(evt);
            }
        });
        jLabel_EliminarEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarECMouseExited(evt);
            }
        });
        Panel_ECTIMEC.add(jLabel_EliminarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarEC.setText("Consultar Empleado Contratado");
        jLabel_ConsultarEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarECMouseMoved(evt);
            }
        });
        jLabel_ConsultarEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarECMouseExited(evt);
            }
        });
        Panel_ECTIMEC.add(jLabel_ConsultarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoEC.setText("Mantenimientos Empleado Contratado");
        jLabel_MantenimientoEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoECMouseMoved(evt);
            }
        });
        jLabel_MantenimientoEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoECMouseExited(evt);
            }
        });
        Panel_ECTIMEC.add(jLabel_MantenimientoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, -1));

        jPanel_RRHH.add(Panel_ECTIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 220, 90));

        jLabel_AE.setText("Actividad Empleado");
        jLabel_AE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_AEMouseMoved(evt);
            }
        });
        jLabel_AE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AEMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, 20));

        Panel_AEIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_AEIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_AEIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_AEIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_AEIMECMouseMoved(evt);
            }
        });
        Panel_AEIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_AEIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_AEIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_AEIMECMouseReleased(evt);
            }
        });
        Panel_AEIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ModificarAE.setText("Modificar Actividad Empleado");
        jLabel_ModificarAE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ModificarAE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAEMouseMoved(evt);
            }
        });
        jLabel_ModificarAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAEMouseExited(evt);
            }
        });
        Panel_AEIMEC.add(jLabel_ModificarAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel_EliminarAE.setText("Eliminar Actividad Empleado");
        jLabel_EliminarAE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_EliminarAE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAEMouseMoved(evt);
            }
        });
        jLabel_EliminarAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_EliminarAEMouseExited(evt);
            }
        });
        Panel_AEIMEC.add(jLabel_EliminarAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel_ConsultarAE.setText("Consultar Actividad Empleado");
        jLabel_ConsultarAE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarAE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAEMouseMoved(evt);
            }
        });
        jLabel_ConsultarAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarAEMouseExited(evt);
            }
        });
        Panel_AEIMEC.add(jLabel_ConsultarAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel_MantenimientoAE.setText("Mantenimientos Actividad Empleado");
        jLabel_MantenimientoAE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MantenimientoAE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAEMouseMoved(evt);
            }
        });
        jLabel_MantenimientoAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MantenimientoAEMouseExited(evt);
            }
        });
        Panel_AEIMEC.add(jLabel_MantenimientoAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, -1));

        jPanel_RRHH.add(Panel_AEIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 220, 90));

        jLabel_BE.setText("Bitacora Empleado");
        jLabel_BE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_BEMouseMoved(evt);
            }
        });
        jLabel_BE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BEMouseClicked(evt);
            }
        });
        jPanel_RRHH.add(jLabel_BE, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, -1, 20));

        Panel_BEIMEC.setBackground(new java.awt.Color(255, 255, 255));
        Panel_BEIMEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_BEIMEC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Panel_BEIMECMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel_BEIMECMouseMoved(evt);
            }
        });
        Panel_BEIMEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_BEIMECMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_BEIMECMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_BEIMECMouseReleased(evt);
            }
        });
        Panel_BEIMEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ConsultarBE.setText("Consultar Bitacora Empleado");
        jLabel_ConsultarBE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ConsultarBE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarBEMouseMoved(evt);
            }
        });
        jLabel_ConsultarBE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarBEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ConsultarBEMouseExited(evt);
            }
        });
        Panel_BEIMEC.add(jLabel_ConsultarBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jPanel_RRHH.add(Panel_BEIMEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 540, 210, 40));

        jPanel_MantenimientoBE.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoBE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Buscar_BE.setText("Buscar");
        jLabel_Buscar_BE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Buscar_BEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoBE.add(jLabel_Buscar_BE, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        txt_Buscar_BE.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_BE.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_BE.setBorder(null);
        txt_Buscar_BE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_BEActionPerformed(evt);
            }
        });
        txt_Buscar_BE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_BEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Buscar_BEKeyTyped(evt);
            }
        });
        jPanel_MantenimientoBE.add(txt_Buscar_BE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 290, 20));

        tbl_BE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_BE.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_BE.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_BE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_BEMouseClicked(evt);
            }
        });
        jScrollPane40.setViewportView(tbl_BE);

        jPanel_MantenimientoBE.add(jScrollPane40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 1110, 250));

        jLabel1.setText("Bitacora Empleado");
        jPanel_MantenimientoBE.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 120, 50));

        jTextField_Encontraid.setBorder(null);
        jTextField_Encontraid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EncontraidActionPerformed(evt);
            }
        });
        jPanel_MantenimientoBE.add(jTextField_Encontraid, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 190, 30));

        jLabel2.setText("ingrese el id del empleado ya contratado a consultar.");
        jPanel_MantenimientoBE.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        txt_contra.setForeground(new java.awt.Color(255, 255, 255));
        txt_contra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_MantenimientoBE.add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 70, -1));

        txt_puesto.setForeground(new java.awt.Color(255, 255, 255));
        txt_puesto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_puestoActionPerformed(evt);
            }
        });
        jPanel_MantenimientoBE.add(txt_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 70, -1));

        txt_depa.setForeground(new java.awt.Color(255, 255, 255));
        txt_depa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_MantenimientoBE.add(txt_depa, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 80, -1));

        txt_peri.setForeground(new java.awt.Color(255, 255, 255));
        txt_peri.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_MantenimientoBE.add(txt_peri, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 70, -1));

        txt_selec.setForeground(new java.awt.Color(255, 255, 255));
        txt_selec.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_MantenimientoBE.add(txt_selec, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 80, -1));

        txt_ap.setForeground(new java.awt.Color(255, 255, 255));
        txt_ap.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_MantenimientoBE.add(txt_ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 80, -1));

        txt_idap.setForeground(new java.awt.Color(255, 255, 255));
        txt_idap.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_MantenimientoBE.add(txt_idap, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 70, -1));

        txt_dpi.setForeground(new java.awt.Color(255, 255, 255));
        txt_dpi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_dpi.setFocusable(false);
        jPanel_MantenimientoBE.add(txt_dpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 80, -1));

        jPanel_RRHH.add(jPanel_MantenimientoBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 680));

        jPanel_MantenimientoEC.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoEC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_EC.setText("ID Empleado Contratado");
        jPanel_MantenimientoEC.add(jLabel_ID_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_id_EC.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_EC.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_EC.setBorder(null);
        txt_id_EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ECActionPerformed(evt);
            }
        });
        jPanel_MantenimientoEC.add(txt_id_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 20));

        jLabel_CEC.setText("Contratacion");
        jPanel_MantenimientoEC.add(jLabel_CEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        jPanel_MantenimientoEC.add(jLabel_CECC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 30, 20));

        jComboBox_CEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CECActionPerformed(evt);
            }
        });
        jPanel_MantenimientoEC.add(jComboBox_CEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, -1));

        jLabel_ECP.setText("Puesto");
        jPanel_MantenimientoEC.add(jLabel_ECP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));
        jPanel_MantenimientoEC.add(jLabel_ECPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 30, 20));

        jComboBox_ECP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ECPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoEC.add(jComboBox_ECP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, -1));

        jLabel_ECD.setText("Departamento");
        jPanel_MantenimientoEC.add(jLabel_ECD, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));
        jPanel_MantenimientoEC.add(jLabel_ECDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 30, 20));

        jComboBox_ECD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ECDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoEC.add(jComboBox_ECD, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 140, -1));

        jLabe_SEC.setText("Sueldo Empleado Contratado");
        jPanel_MantenimientoEC.add(jLabe_SEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        txt_SEC.setBackground(new java.awt.Color(231, 231, 231));
        txt_SEC.setForeground(new java.awt.Color(153, 153, 153));
        txt_SEC.setBorder(null);
        txt_SEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SECActionPerformed(evt);
            }
        });
        jPanel_MantenimientoEC.add(txt_SEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 180, 20));

        jLabel_IngresarEC.setText("Ingresar");
        jLabel_IngresarEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarECMouseClicked(evt);
            }
        });
        jPanel_MantenimientoEC.add(jLabel_IngresarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 50, 40));

        jLabel_Modificar_EC.setText("Modificar");
        jLabel_Modificar_EC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_ECMouseClicked(evt);
            }
        });
        jPanel_MantenimientoEC.add(jLabel_Modificar_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 60, 20));

        jLabel_Eliminar_EC.setText("Eliminar");
        jLabel_Eliminar_EC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_ECMouseClicked(evt);
            }
        });
        jPanel_MantenimientoEC.add(jLabel_Eliminar_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 50, 20));

        jLabel_BuscarEC.setText("Buscar");
        jPanel_MantenimientoEC.add(jLabel_BuscarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 50, 20));

        txt_BuscarEC.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarEC.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarEC.setBorder(null);
        txt_BuscarEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarECActionPerformed(evt);
            }
        });
        txt_BuscarEC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_BuscarECKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarECKeyReleased(evt);
            }
        });
        jPanel_MantenimientoEC.add(txt_BuscarEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 240, 20));

        tbl_EC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_EC.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_EC.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_EC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ECMouseClicked(evt);
            }
        });
        jScrollPane38.setViewportView(tbl_EC);

        jPanel_MantenimientoEC.add(jScrollPane38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        jPanel_MantenimientoC.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_C.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_C.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_C.setBorder(null);
        txt_id_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_CActionPerformed(evt);
            }
        });
        jPanel_MantenimientoC.add(txt_id_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 20));

        jLabel_ID_C.setText("ID Contratacion");
        jPanel_MantenimientoC.add(jLabel_ID_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 90, -1));

        jLabel_PPC.setText("Periodo Prueba");
        jPanel_MantenimientoC.add(jLabel_PPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));
        jPanel_MantenimientoC.add(jLabel_PPCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 30, 20));

        jComboBox_PPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PPCActionPerformed(evt);
            }
        });
        jComboBox_PPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox_PPCKeyReleased(evt);
            }
        });
        jPanel_MantenimientoC.add(jComboBox_PPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 140, -1));

        txt_FC.setBackground(new java.awt.Color(231, 231, 231));
        txt_FC.setForeground(new java.awt.Color(153, 153, 153));
        txt_FC.setBorder(null);
        txt_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FCActionPerformed(evt);
            }
        });
        jPanel_MantenimientoC.add(txt_FC, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 140, 20));

        jLabel_FC.setText("Fecha Contratacion");
        jPanel_MantenimientoC.add(jLabel_FC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 110, -1));

        txt_DC.setBackground(new java.awt.Color(231, 231, 231));
        txt_DC.setForeground(new java.awt.Color(153, 153, 153));
        txt_DC.setBorder(null);
        txt_DC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DCActionPerformed(evt);
            }
        });
        jPanel_MantenimientoC.add(txt_DC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 140, 20));

        jLabel_DC.setText("Duracion Contrato");
        jPanel_MantenimientoC.add(jLabel_DC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 110, -1));

        txt_EC.setBackground(new java.awt.Color(231, 231, 231));
        txt_EC.setForeground(new java.awt.Color(153, 153, 153));
        txt_EC.setBorder(null);
        txt_EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ECActionPerformed(evt);
            }
        });
        jPanel_MantenimientoC.add(txt_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, 20));

        jLabel_EC.setText("Estatus Contratacion");
        jPanel_MantenimientoC.add(jLabel_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 130, -1));

        jLabel_InsertarC.setText("Insertar");
        jLabel_InsertarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_InsertarCMouseClicked(evt);
            }
        });
        jPanel_MantenimientoC.add(jLabel_InsertarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jLabel_Modificar_C.setText("Modificar");
        jLabel_Modificar_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_CMouseClicked(evt);
            }
        });
        jPanel_MantenimientoC.add(jLabel_Modificar_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, -1));

        jLabel_Eliminar_C.setText("Eliminar");
        jLabel_Eliminar_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_CMouseClicked(evt);
            }
        });
        jPanel_MantenimientoC.add(jLabel_Eliminar_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        jLabel_Buscar_C.setText("Buscar");
        jPanel_MantenimientoC.add(jLabel_Buscar_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        txt_Buscar_C.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_C.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_C.setBorder(null);
        txt_Buscar_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_CActionPerformed(evt);
            }
        });
        txt_Buscar_C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_CKeyReleased(evt);
            }
        });
        jPanel_MantenimientoC.add(txt_Buscar_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 290, 20));

        tbl_C.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_C.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_C.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CMouseClicked(evt);
            }
        });
        jScrollPane37.setViewportView(tbl_C);

        jPanel_MantenimientoC.add(jScrollPane37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        jPanel_MantenimientoPP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoPP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_PP.setText("ID Periodo Prueba");
        jPanel_MantenimientoPP.add(jLabel_ID_PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        txt_id_PP.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_PP.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_PP.setBorder(null);
        txt_id_PP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_PPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoPP.add(txt_id_PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 20));

        jLabel_PPS.setText("Seleccion");
        jPanel_MantenimientoPP.add(jLabel_PPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));
        jPanel_MantenimientoPP.add(jLabel_PPSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 30, 20));

        jComboBox_PPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PPSActionPerformed(evt);
            }
        });
        jPanel_MantenimientoPP.add(jComboBox_PPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 140, -1));

        jLabel_FI.setText("Fecha de Inicio");
        jPanel_MantenimientoPP.add(jLabel_FI, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        txt_id_FI.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_FI.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_FI.setBorder(null);
        txt_id_FI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_FIActionPerformed(evt);
            }
        });
        jPanel_MantenimientoPP.add(txt_id_FI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 140, 20));

        jLabel_FF.setText("Fecha de Finalizacion");
        jPanel_MantenimientoPP.add(jLabel_FF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        txt_id_FF.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_FF.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_FF.setBorder(null);
        txt_id_FF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_FFActionPerformed(evt);
            }
        });
        jPanel_MantenimientoPP.add(txt_id_FF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 140, 20));

        jLabel_Pago.setText("Pago");
        jPanel_MantenimientoPP.add(jLabel_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txt_id_Pago.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_Pago.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_Pago.setBorder(null);
        txt_id_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_PagoActionPerformed(evt);
            }
        });
        jPanel_MantenimientoPP.add(txt_id_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, 20));

        jLabel_PPA.setText("Actividad");
        jPanel_MantenimientoPP.add(jLabel_PPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jComboBox_PPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PPAActionPerformed(evt);
            }
        });
        jPanel_MantenimientoPP.add(jComboBox_PPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 140, -1));
        jPanel_MantenimientoPP.add(jLabel_PPAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 30, 20));

        jLabel_IngresarPP.setText("Ingresar");
        jLabel_IngresarPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarPPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoPP.add(jLabel_IngresarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 50, 40));

        jLabel_Modificar_PP.setText("Modificar");
        jLabel_Modificar_PP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_PPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoPP.add(jLabel_Modificar_PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 60, 20));

        jLabel_Eliminar_PP.setText("Eliminar");
        jLabel_Eliminar_PP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_PPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoPP.add(jLabel_Eliminar_PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 50, 20));

        jLabel_BuscarPP.setText("Buscar");
        jLabel_BuscarPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarPPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoPP.add(jLabel_BuscarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 50, 20));

        txt_BuscarPP.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarPP.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarPP.setBorder(null);
        txt_BuscarPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarPPActionPerformed(evt);
            }
        });
        txt_BuscarPP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarPPKeyReleased(evt);
            }
        });
        jPanel_MantenimientoPP.add(txt_BuscarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 240, 20));

        tbl_PP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_PP.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_PP.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_PP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PPMouseClicked(evt);
            }
        });
        jScrollPane36.setViewportView(tbl_PP);

        jPanel_MantenimientoPP.add(jScrollPane36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 720));

        jPanel_MantenimientoExpLD.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoExpLD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_ExpLD.setText("ID Experiencia Laboral Detallada");
        jPanel_MantenimientoExpLD.add(jLabel_ID_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txt_id_ExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_ExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_ExpLD.setBorder(null);
        txt_id_ExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ExpLDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(txt_id_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 20));

        jLabel_NombreExpLD.setText("Nombre de Experiencia Laboral Detallada");
        jPanel_MantenimientoExpLD.add(jLabel_NombreExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        txt_NombreExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_NombreExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreExpLD.setBorder(null);
        txt_NombreExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreExpLDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(txt_NombreExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 20));

        jLabel_Nombre_EmpresaExpLD.setText("Nombre Empresa de Experiencia Laboral Detallada");
        jPanel_MantenimientoExpLD.add(jLabel_Nombre_EmpresaExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        txt_Nombre_EmpresaExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Nombre_EmpresaExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Nombre_EmpresaExpLD.setBorder(null);
        txt_Nombre_EmpresaExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_EmpresaExpLDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(txt_Nombre_EmpresaExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 290, 20));

        jLabel_Tiempo_InicioExpLD.setText("Tiempo de Inicio de Experiencia Laboral Detallada");
        jPanel_MantenimientoExpLD.add(jLabel_Tiempo_InicioExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txt_Tiempo_InicioExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Tiempo_InicioExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Tiempo_InicioExpLD.setBorder(null);
        txt_Tiempo_InicioExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tiempo_InicioExpLDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(txt_Tiempo_InicioExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, 20));

        jLabel_Tiempo_FinalizacionExpLD.setText("Tiempo de Finalizacion de Experiencia Laboral Detallada");
        jPanel_MantenimientoExpLD.add(jLabel_Tiempo_FinalizacionExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        txt_Tiempo_FinalizacionExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Tiempo_FinalizacionExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Tiempo_FinalizacionExpLD.setBorder(null);
        txt_Tiempo_FinalizacionExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tiempo_FinalizacionExpLDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(txt_Tiempo_FinalizacionExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 320, 20));

        jLabel_Insertar_ExpLD.setText("Insertar");
        jLabel_Insertar_ExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_ExpLDMouseClicked(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(jLabel_Insertar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        jLabel_Modificar_ExpLD.setText("Modificar");
        jLabel_Modificar_ExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_ExpLDMouseClicked(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(jLabel_Modificar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        jLabel_Eliminar_ExpLD.setText("Eliminar");
        jLabel_Eliminar_ExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_ExpLDMouseClicked(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(jLabel_Eliminar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, -1));

        jLabel_Buscar_ExpLD.setText("Buscar");
        jPanel_MantenimientoExpLD.add(jLabel_Buscar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        txt_Buscar_ExpLD.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_ExpLD.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_ExpLD.setBorder(null);
        txt_Buscar_ExpLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_ExpLDActionPerformed(evt);
            }
        });
        txt_Buscar_ExpLD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_ExpLDKeyReleased(evt);
            }
        });
        jPanel_MantenimientoExpLD.add(txt_Buscar_ExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 290, 20));

        tbl_ExpLD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_ExpLD.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_ExpLD.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_ExpLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ExpLDMouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(tbl_ExpLD);

        jPanel_MantenimientoExpLD.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 730, 190));

        jPanel_RRHH.add(jPanel_MantenimientoExpLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientosRP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientosRP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_RP.setText("ID Referencia Personal");
        jPanel_MantenimientosRP.add(jLabel_ID_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txt_id_RP.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_RP.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_RP.setBorder(null);
        txt_id_RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_RPActionPerformed(evt);
            }
        });
        jPanel_MantenimientosRP.add(txt_id_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 20));

        jLabel_Nombre_RP.setText("Nombre Persona Referencia Personal");
        jPanel_MantenimientosRP.add(jLabel_Nombre_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        txt_Nombre_RP.setBackground(new java.awt.Color(231, 231, 231));
        txt_Nombre_RP.setForeground(new java.awt.Color(153, 153, 153));
        txt_Nombre_RP.setBorder(null);
        txt_Nombre_RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_RPActionPerformed(evt);
            }
        });
        jPanel_MantenimientosRP.add(txt_Nombre_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 220, 20));

        jLabel_Telefono_RP.setText("Telefono Referencia Personal");
        jPanel_MantenimientosRP.add(jLabel_Telefono_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        txt_Telefono_RP.setBackground(new java.awt.Color(231, 231, 231));
        txt_Telefono_RP.setForeground(new java.awt.Color(153, 153, 153));
        txt_Telefono_RP.setBorder(null);
        txt_Telefono_RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Telefono_RPActionPerformed(evt);
            }
        });
        jPanel_MantenimientosRP.add(txt_Telefono_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 170, 20));

        jLabel_Insertar_RP.setText("Insertar");
        jLabel_Insertar_RP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_RPMouseClicked(evt);
            }
        });
        jPanel_MantenimientosRP.add(jLabel_Insertar_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        jLabel_Modificar_RP.setText("Modificar");
        jLabel_Modificar_RP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_RPMouseClicked(evt);
            }
        });
        jPanel_MantenimientosRP.add(jLabel_Modificar_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jLabel_Eliminar_RP.setText("Eliminar");
        jLabel_Eliminar_RP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_RPMouseClicked(evt);
            }
        });
        jPanel_MantenimientosRP.add(jLabel_Eliminar_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        txt_Buscar_RP.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_RP.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_RP.setBorder(null);
        txt_Buscar_RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_RPActionPerformed(evt);
            }
        });
        txt_Buscar_RP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_RPKeyReleased(evt);
            }
        });
        jPanel_MantenimientosRP.add(txt_Buscar_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 290, 20));

        jLabel_Buscar_RP.setText("Buscar");
        jPanel_MantenimientosRP.add(jLabel_Buscar_RP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        tbl_RP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_RP.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_RP.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jScrollPane29.setViewportView(tbl_RP);

        jPanel_MantenimientosRP.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientosRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 640));

        jPanel_Tipo_Prueba.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Tipo_Prueba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Prueba.setText("ID Prueba");
        jPanel_Tipo_Prueba.add(jLabel_Prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        txt_id_TP.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_TP.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_TP.setBorder(null);
        txt_id_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_TPActionPerformed(evt);
            }
        });
        jPanel_Tipo_Prueba.add(txt_id_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, 20));
        jPanel_Tipo_Prueba.add(jLabel_DPIAP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel_TP.setText("Tipo Prueba");
        jPanel_Tipo_Prueba.add(jLabel_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        txt_TP.setBackground(new java.awt.Color(231, 231, 231));
        txt_TP.setForeground(new java.awt.Color(153, 153, 153));
        txt_TP.setBorder(null);
        txt_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TPActionPerformed(evt);
            }
        });
        jPanel_Tipo_Prueba.add(txt_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 140, 20));

        jLabel_IngresarTP.setText("Ingresar");
        jLabel_IngresarTP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarTPMouseClicked(evt);
            }
        });
        jPanel_Tipo_Prueba.add(jLabel_IngresarTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 50, 40));

        jLabel_Modificar_TP.setText("Modificar");
        jLabel_Modificar_TP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_TPMouseClicked(evt);
            }
        });
        jPanel_Tipo_Prueba.add(jLabel_Modificar_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 60, 20));

        jLabel_Eliminar_TP.setText("Eliminar");
        jLabel_Eliminar_TP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_TPMouseClicked(evt);
            }
        });
        jPanel_Tipo_Prueba.add(jLabel_Eliminar_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 50, 20));

        tbl_TP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_TP.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_TP.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_TP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TPMouseClicked(evt);
            }
        });
        jScrollPane32.setViewportView(tbl_TP);

        jPanel_Tipo_Prueba.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 600, 190));

        txt_BuscarTP.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarTP.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarTP.setBorder(null);
        txt_BuscarTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarTPActionPerformed(evt);
            }
        });
        txt_BuscarTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarTPKeyReleased(evt);
            }
        });
        jPanel_Tipo_Prueba.add(txt_BuscarTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 240, 20));

        jLabel_BuscarTP.setText("Buscar");
        jLabel_BuscarTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarTPMouseClicked(evt);
            }
        });
        jPanel_Tipo_Prueba.add(jLabel_BuscarTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 50, 20));

        jPanel_RRHH.add(jPanel_Tipo_Prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 750));

        jPanel_MantenimientoNA.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoNA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_NivelA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_NivelA.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_NivelA.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_NivelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NivelAMouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(tbl_NivelA);

        jPanel_MantenimientoNA.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 600, 190));

        jLabel_ID_NivelA.setText("ID Nivel  Academico");
        jPanel_MantenimientoNA.add(jLabel_ID_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txt_id_NivelA.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_NivelA.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_NivelA.setBorder(null);
        txt_id_NivelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_NivelAActionPerformed(evt);
            }
        });
        jPanel_MantenimientoNA.add(txt_id_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 140, 20));

        jLabel_Nombre_NivelA.setText("Nombre Nivel Academico");
        jPanel_MantenimientoNA.add(jLabel_Nombre_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        txt_Nombre_NivelA.setBackground(new java.awt.Color(231, 231, 231));
        txt_Nombre_NivelA.setForeground(new java.awt.Color(153, 153, 153));
        txt_Nombre_NivelA.setBorder(null);
        txt_Nombre_NivelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_NivelAActionPerformed(evt);
            }
        });
        jPanel_MantenimientoNA.add(txt_Nombre_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 140, 20));

        jLabel_Descripcion_NivelA.setText("Descripcion Nivel Academico");
        jPanel_MantenimientoNA.add(jLabel_Descripcion_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        txt_Descripcion_NivelA.setBackground(new java.awt.Color(231, 231, 231));
        txt_Descripcion_NivelA.setForeground(new java.awt.Color(153, 153, 153));
        txt_Descripcion_NivelA.setBorder(null);
        txt_Descripcion_NivelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Descripcion_NivelAActionPerformed(evt);
            }
        });
        jPanel_MantenimientoNA.add(txt_Descripcion_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 140, 20));

        jLabel_Insertar_NivelA.setText("Insertar");
        jLabel_Insertar_NivelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_NivelAMouseClicked(evt);
            }
        });
        jPanel_MantenimientoNA.add(jLabel_Insertar_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jLabel_Eliminar_NivelA.setText("Eliminar");
        jLabel_Eliminar_NivelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_NivelAMouseClicked(evt);
            }
        });
        jPanel_MantenimientoNA.add(jLabel_Eliminar_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        jLabel_Modificar_NivelA.setText("Modificar");
        jLabel_Modificar_NivelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_NivelAMouseClicked(evt);
            }
        });
        jPanel_MantenimientoNA.add(jLabel_Modificar_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        jLabel_Buscar_NivelA.setText("Buscar");
        jPanel_MantenimientoNA.add(jLabel_Buscar_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        txt_Buscar_NivelA.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_NivelA.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_NivelA.setBorder(null);
        txt_Buscar_NivelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_NivelAActionPerformed(evt);
            }
        });
        txt_Buscar_NivelA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_NivelAKeyReleased(evt);
            }
        });
        jPanel_MantenimientoNA.add(txt_Buscar_NivelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 290, 20));

        jPanel_RRHH.add(jPanel_MantenimientoNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        jPanel_MantenimientoAP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoAP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_AP.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_AP.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_AP.setBorder(null);
        txt_id_AP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_APActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAP.add(txt_id_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 140, 20));

        jLabel_ID_AP.setText("ID Aplicacion");
        jPanel_MantenimientoAP.add(jLabel_ID_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel_DPIAP.setText("Nombre");
        jPanel_MantenimientoAP.add(jLabel_DPIAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jComboBox_DPIAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DPIAPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAP.add(jComboBox_DPIAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 140, -1));

        txt_RequisitosAP.setBackground(new java.awt.Color(231, 231, 231));
        txt_RequisitosAP.setForeground(new java.awt.Color(153, 153, 153));
        txt_RequisitosAP.setBorder(null);
        txt_RequisitosAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RequisitosAPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAP.add(txt_RequisitosAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 140, 20));

        jLabel_RequisitosAP.setText("Cumple Requisitos?");
        jPanel_MantenimientoAP.add(jLabel_RequisitosAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        jLabel_IngresarAP.setText("Ingresar");
        jLabel_IngresarAP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarAPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAP.add(jLabel_IngresarAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 50, 40));

        jLabel_Modificar_AP.setText("Modificar");
        jLabel_Modificar_AP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_APMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAP.add(jLabel_Modificar_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 60, 20));

        jLabel_Eliminar_AP.setText("Eliminar");
        jLabel_Eliminar_AP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_APMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAP.add(jLabel_Eliminar_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 50, 20));

        tbl_AP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_AP.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_AP.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_AP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_APMouseClicked(evt);
            }
        });
        jScrollPane31.setViewportView(tbl_AP);

        jPanel_MantenimientoAP.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 600, 190));

        txt_BuscarAP.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarAP.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarAP.setBorder(null);
        txt_BuscarAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarAPActionPerformed(evt);
            }
        });
        txt_BuscarAP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarAPKeyReleased(evt);
            }
        });
        jPanel_MantenimientoAP.add(txt_BuscarAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 240, 20));

        jLabel_BuscarAP.setText("Buscar");
        jLabel_BuscarAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarAPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAP.add(jLabel_BuscarAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, 20));

        jLabel_DPI_AP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_MantenimientoAP.add(jLabel_DPI_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, 20));

        jLabel_NombreAP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NombreAP.setText("DPI");
        jPanel_MantenimientoAP.add(jLabel_NombreAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 70, -1));

        jPanel_RRHH.add(jPanel_MantenimientoAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));

        jPanel_MantenimientoExpL.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoExpL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_ExpL.setText("ID Nivel  Experiencia Laboral");
        jPanel_MantenimientoExpL.add(jLabel_ID_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        txt_id_ExpL.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_ExpL.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_ExpL.setBorder(null);
        txt_id_ExpL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ExpLActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpL.add(txt_id_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, 20));

        jLabel_ID_ExpLLD.setText("Experienca Laboral Detallada ");
        jPanel_MantenimientoExpL.add(jLabel_ID_ExpLLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));
        jPanel_MantenimientoExpL.add(jLabel_id_Nombre_EpLLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 40, 20));

        jLabel_Insertar_ExpL.setText("Insertar");
        jLabel_Insertar_ExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_ExpLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoExpL.add(jLabel_Insertar_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jLabel_Modificar_ExpL.setText("Modificar");
        jLabel_Modificar_ExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_ExpLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoExpL.add(jLabel_Modificar_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        jLabel_Eliminar_ExpL.setText("Eliminar");
        jLabel_Eliminar_ExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_ExpLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoExpL.add(jLabel_Eliminar_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        txt_Buscar_ExpL.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_ExpL.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_ExpL.setBorder(null);
        txt_Buscar_ExpL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_ExpLActionPerformed(evt);
            }
        });
        txt_Buscar_ExpL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_ExpLKeyReleased(evt);
            }
        });
        jPanel_MantenimientoExpL.add(txt_Buscar_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 290, 20));

        jLabel_Buscar_ExpL.setText("Buscar");
        jPanel_MantenimientoExpL.add(jLabel_Buscar_ExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        tbl_ExpL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_ExpL.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_ExpL.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_ExpL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ExpLMouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(tbl_ExpL);

        jPanel_MantenimientoExpL.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 600, 190));

        jComboBox_Nombre_EpLLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Nombre_EpLLDActionPerformed(evt);
            }
        });
        jPanel_MantenimientoExpL.add(jComboBox_Nombre_EpLLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 170, -1));

        jPanel_RRHH.add(jPanel_MantenimientoExpL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MatenimientosD.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MatenimientosD.setPreferredSize(new java.awt.Dimension(1080, 700));
        jPanel_MatenimientosD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_Departamento.setText("ID Departamento");
        jPanel_MatenimientosD.add(jLabel_ID_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txt_id_Departamento.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_Departamento.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_Departamento.setBorder(null);
        txt_id_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_DepartamentoActionPerformed(evt);
            }
        });
        jPanel_MatenimientosD.add(txt_id_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 20));

        jLabel_NombreD.setText("Nombre Departamento");
        jPanel_MatenimientosD.add(jLabel_NombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txt_Nombre_Departamento.setBackground(new java.awt.Color(231, 231, 231));
        txt_Nombre_Departamento.setForeground(new java.awt.Color(153, 153, 153));
        txt_Nombre_Departamento.setBorder(null);
        txt_Nombre_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_DepartamentoActionPerformed(evt);
            }
        });
        jPanel_MatenimientosD.add(txt_Nombre_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 150, 20));

        jLabel_Estatus_Departamento.setText("Estatus Departamento");
        jPanel_MatenimientosD.add(jLabel_Estatus_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        txt_Estatus_Departamento.setBackground(new java.awt.Color(231, 231, 231));
        txt_Estatus_Departamento.setForeground(new java.awt.Color(153, 153, 153));
        txt_Estatus_Departamento.setBorder(null);
        txt_Estatus_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Estatus_DepartamentoActionPerformed(evt);
            }
        });
        jPanel_MatenimientosD.add(txt_Estatus_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, 20));

        jLabel_Ingresar.setText("Ingresar");
        jLabel_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarMouseClicked(evt);
            }
        });
        jPanel_MatenimientosD.add(jLabel_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 50, 40));

        tbl_Departamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_Departamento.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_Departamento.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_Departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DepartamentoMouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(tbl_Departamento);

        jPanel_MatenimientosD.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 600, 190));

        jLabel_Buscar.setText("Buscar");
        jPanel_MatenimientosD.add(jLabel_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 50, 20));

        txt_Buscar.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar.setBorder(null);
        txt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarActionPerformed(evt);
            }
        });
        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyReleased(evt);
            }
        });
        jPanel_MatenimientosD.add(txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 20));

        jLabel_Modificar.setText("Modificar");
        jLabel_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ModificarMouseClicked(evt);
            }
        });
        jPanel_MatenimientosD.add(jLabel_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 60, 20));

        jLabel_Eliminar.setText("Eliminar");
        jLabel_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EliminarMouseClicked(evt);
            }
        });
        jPanel_MatenimientosD.add(jLabel_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 50, 20));

        jPanel_RRHH.add(jPanel_MatenimientosD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 800));

        jPanel_Mantenimiento_Medio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Mantenimiento_Medio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_Medio.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_Medio.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_Medio.setBorder(null);
        txt_id_Medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_MedioActionPerformed(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(txt_id_Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 20));

        jLabel_ID_Medio.setText("ID Medio ");
        jPanel_Mantenimiento_Medio.add(jLabel_ID_Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, -1));

        jLabel_NombreSEM.setText("ID de Solicitud Empresarial");
        jPanel_Mantenimiento_Medio.add(jLabel_NombreSEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));
        jPanel_Mantenimiento_Medio.add(jLabel_ID_SEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 30, 20));

        jComboBox_IDSEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_IDSEMActionPerformed(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(jComboBox_IDSEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, 20));

        txt_NombreM.setBackground(new java.awt.Color(231, 231, 231));
        txt_NombreM.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreM.setBorder(null);
        txt_NombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreMActionPerformed(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(txt_NombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 140, 20));

        jLabel_NombreM.setText("Nombre Medio");
        jPanel_Mantenimiento_Medio.add(jLabel_NombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 100, -1));

        jLabel_DescripcionM.setText("Descripcion Medio");
        jPanel_Mantenimiento_Medio.add(jLabel_DescripcionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jTextArea_DescripcionM.setColumns(20);
        jTextArea_DescripcionM.setRows(5);
        jTextArea_DescripcionM.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jScrollPane2.setViewportView(jTextArea_DescripcionM);

        jPanel_Mantenimiento_Medio.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        tbl_Medio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_Medio.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_Medio.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jScrollPane27.setViewportView(tbl_Medio);

        jPanel_Mantenimiento_Medio.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 600, 190));

        jLabel_BuscarM.setText("Buscar");
        jLabel_BuscarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarMMouseClicked(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(jLabel_BuscarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, 20));

        txt_BuscarM.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarM.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarM.setBorder(null);
        txt_BuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarMActionPerformed(evt);
            }
        });
        txt_BuscarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarMKeyReleased(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(txt_BuscarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 240, 20));

        jLabel_IngresarM.setText("Ingresar");
        jLabel_IngresarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarMMouseClicked(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(jLabel_IngresarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 50, 40));

        jLabel_ModificarM.setText("Modificar");
        jLabel_ModificarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ModificarMMouseClicked(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(jLabel_ModificarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 60, 20));

        jLabel_EliminarM.setText("Eliminar");
        jLabel_EliminarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EliminarMMouseClicked(evt);
            }
        });
        jPanel_Mantenimiento_Medio.add(jLabel_EliminarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 50, 20));

        jPanel_RRHH.add(jPanel_Mantenimiento_Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientoRL.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoRL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_ReferenciaL.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_ReferenciaL.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_ReferenciaL.setBorder(null);
        txt_id_ReferenciaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_ReferenciaLActionPerformed(evt);
            }
        });
        jPanel_MantenimientoRL.add(txt_id_ReferenciaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 20));

        jLabel_ID_ReferenciaL.setText("ID Referencia Laboral");
        jPanel_MantenimientoRL.add(jLabel_ID_ReferenciaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_NombreRL.setBackground(new java.awt.Color(231, 231, 231));
        txt_NombreRL.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreRL.setBorder(null);
        txt_NombreRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreRLActionPerformed(evt);
            }
        });
        jPanel_MantenimientoRL.add(txt_NombreRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 210, 20));

        jLabel_NombreRL.setText("Nombre Persona Referencia Laboral");
        jPanel_MantenimientoRL.add(jLabel_NombreRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        txt_TelefonoRL.setBackground(new java.awt.Color(231, 231, 231));
        txt_TelefonoRL.setForeground(new java.awt.Color(153, 153, 153));
        txt_TelefonoRL.setBorder(null);
        txt_TelefonoRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoRLActionPerformed(evt);
            }
        });
        jPanel_MantenimientoRL.add(txt_TelefonoRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 210, 20));

        jLabel_TelefonoRL.setText("Telefono Persona Referencia Laboral");
        jPanel_MantenimientoRL.add(jLabel_TelefonoRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel_IngresarRL.setText("Ingresar");
        jLabel_IngresarRL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarRLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoRL.add(jLabel_IngresarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 50, 40));

        jLabel_ModificarRL.setText("Modificar");
        jLabel_ModificarRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ModificarRLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoRL.add(jLabel_ModificarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 60, 20));

        jLabel_EliminarRL.setText("Eliminar");
        jLabel_EliminarRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EliminarRLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoRL.add(jLabel_EliminarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 50, 20));

        tbl_RL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_RL.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_RL.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_RL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RLMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(tbl_RL);

        jPanel_MantenimientoRL.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 600, 190));

        jLabel_BuscarRL.setText("Buscar");
        jLabel_BuscarRL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarRLMouseClicked(evt);
            }
        });
        jPanel_MantenimientoRL.add(jLabel_BuscarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 50, 20));

        txt_BuscarRL.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarRL.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarRL.setBorder(null);
        txt_BuscarRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarRLActionPerformed(evt);
            }
        });
        txt_BuscarRL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarRLKeyReleased(evt);
            }
        });
        jPanel_MantenimientoRL.add(txt_BuscarRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 240, 20));

        jPanel_RRHH.add(jPanel_MantenimientoRL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientoSE.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoSE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DescripcionSE.setText("Descripcion Solicitud Empresarial");
        jPanel_MantenimientoSE.add(jLabel_DescripcionSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        txt_id_SolicitudE.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_SolicitudE.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_SolicitudE.setBorder(null);
        txt_id_SolicitudE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_SolicitudEActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(txt_id_SolicitudE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 20));

        jLabel_RangoEdadM.setText("Rango de Edad Menor");
        jPanel_MantenimientoSE.add(jLabel_RangoEdadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        txt_RangoEdadM.setBackground(new java.awt.Color(231, 231, 231));
        txt_RangoEdadM.setForeground(new java.awt.Color(153, 153, 153));
        txt_RangoEdadM.setBorder(null);
        txt_RangoEdadM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RangoEdadMActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(txt_RangoEdadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, 20));

        jLabel_RangoEdadMa.setText("Rango de Edad Mayor");
        jPanel_MantenimientoSE.add(jLabel_RangoEdadMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        txt_RangoEdadMa.setBackground(new java.awt.Color(231, 231, 231));
        txt_RangoEdadMa.setForeground(new java.awt.Color(153, 153, 153));
        txt_RangoEdadMa.setBorder(null);
        txt_RangoEdadMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RangoEdadMaActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(txt_RangoEdadMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, 20));

        jLabel_RangoEdadMa1.setText("Genero");
        jPanel_MantenimientoSE.add(jLabel_RangoEdadMa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        txt_Genero.setBackground(new java.awt.Color(231, 231, 231));
        txt_Genero.setForeground(new java.awt.Color(153, 153, 153));
        txt_Genero.setBorder(null);
        txt_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeneroActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(txt_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 140, 20));

        jLabel_PuestoSE.setText("Puesto");
        jPanel_MantenimientoSE.add(jLabel_PuestoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel_Puesto_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Puesto_SEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoSE.add(jLabel_Puesto_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 30, 20));

        jComboBox_PuestoSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PuestoSEActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(jComboBox_PuestoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 140, -1));

        jLabel_DepartamentoSE.setText("Departamento");
        jPanel_MantenimientoSE.add(jLabel_DepartamentoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel_MantenimientoSE.add(jLabel_Departamento_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 30, 20));

        jComboBox_DepartamentoSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DepartamentoSEActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(jComboBox_DepartamentoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, -1));

        jLabel_NivelASE.setText("Nivel Academico");
        jPanel_MantenimientoSE.add(jLabel_NivelASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));

        jLabel_NivelA_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NivelA_SEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoSE.add(jLabel_NivelA_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 30, 20));

        jComboBox_NivelASE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NivelASEActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(jComboBox_NivelASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        jLabel_ExperieciaLSE.setText("Experiencia Laboral");
        jPanel_MantenimientoSE.add(jLabel_ExperieciaLSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, -1));
        jPanel_MantenimientoSE.add(jLabel_ExperienciaL_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 30, 20));

        jComboBox_ExperienciaL_SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ExperienciaL_SEActionPerformed(evt);
            }
        });
        jPanel_MantenimientoSE.add(jComboBox_ExperienciaL_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, -1));

        jLabel_ID_SolicitudE1.setText("ID Solicitud Empresarial");
        jPanel_MantenimientoSE.add(jLabel_ID_SolicitudE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextArea_DescripcionSE.setColumns(20);
        jTextArea_DescripcionSE.setRows(5);
        jTextArea_DescripcionSE.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jScrollPane1.setViewportView(jTextArea_DescripcionSE);

        jPanel_MantenimientoSE.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        tbl_SE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_SE.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_SE.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SEMouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(tbl_SE);

        jPanel_MantenimientoSE.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 750, 190));

        txt_Buscar_SE.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_SE.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_SE.setBorder(null);
        txt_Buscar_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_Buscar_SEMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_Buscar_SEMouseReleased(evt);
            }
        });
        txt_Buscar_SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_SEActionPerformed(evt);
            }
        });
        txt_Buscar_SE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_SEKeyReleased(evt);
            }
        });
        jPanel_MantenimientoSE.add(txt_Buscar_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 290, 20));

        jLabel_Buscar_SE.setText("Buscar");
        jLabel_Buscar_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Buscar_SEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoSE.add(jLabel_Buscar_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel_IngresarSE.setText("Ingresar");
        jLabel_IngresarSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_IngresarSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IngresarSEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoSE.add(jLabel_IngresarSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 50, 40));

        jLabel_Modificar_SE.setText("Modificar");
        jLabel_Modificar_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_SEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoSE.add(jLabel_Modificar_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 60, 20));

        jLabel_Eliminar_SE.setText("Eliminar");
        jLabel_Eliminar_SE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_SEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoSE.add(jLabel_Eliminar_SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 50, 20));

        jPanel_RRHH.add(jPanel_MantenimientoSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientoCV.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoCV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DPICV.setText("DPI ");
        jPanel_MantenimientoCV.add(jLabel_DPICV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txt_DPICV.setBackground(new java.awt.Color(231, 231, 231));
        txt_DPICV.setForeground(new java.awt.Color(153, 153, 153));
        txt_DPICV.setBorder(null);
        txt_DPICV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DPICVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_DPICV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 20));

        jLabel_NombreCV.setText("Nombres");
        jPanel_MantenimientoCV.add(jLabel_NombreCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        txt_NombreCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_NombreCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreCV.setBorder(null);
        txt_NombreCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_NombreCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, 20));

        jLabel_ApellidoCV.setText("Apellidos");
        jPanel_MantenimientoCV.add(jLabel_ApellidoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txt_ApellidoCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_ApellidoCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_ApellidoCV.setBorder(null);
        txt_ApellidoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_ApellidoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 140, 20));

        jLabel_TelefonoCV.setText("Telefono");
        jPanel_MantenimientoCV.add(jLabel_TelefonoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        txt_TelefonoCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_TelefonoCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_TelefonoCV.setBorder(null);
        txt_TelefonoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_TelefonoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 140, 20));

        jLabel_CorreoCV.setText("Correo Electronico");
        jPanel_MantenimientoCV.add(jLabel_CorreoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        txt_CorreoCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_CorreoCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_CorreoCV.setBorder(null);
        txt_CorreoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_CorreoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 140, 20));

        jLabel_DireccionCV.setText("Direccion");
        jPanel_MantenimientoCV.add(jLabel_DireccionCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        txt_DireccionCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_DireccionCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_DireccionCV.setBorder(null);
        txt_DireccionCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DireccionCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_DireccionCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 20));

        jLabel_GeneroCV.setText("Genero");
        jPanel_MantenimientoCV.add(jLabel_GeneroCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        txt_GeneroCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_GeneroCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_GeneroCV.setBorder(null);
        txt_GeneroCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeneroCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_GeneroCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, 20));

        jLabel_EdadCV.setText("Edad");
        jPanel_MantenimientoCV.add(jLabel_EdadCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        txt_EdadCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_EdadCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_EdadCV.setBorder(null);
        txt_EdadCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EdadCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_EdadCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 140, 20));

        jLabel_NivelACV.setText("Nivel Academico");
        jPanel_MantenimientoCV.add(jLabel_NivelACV, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jComboBox_NivelACV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NivelACVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(jComboBox_NivelACV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 140, -1));

        jLabel_RPCV.setText("Referencia Personal");
        jPanel_MantenimientoCV.add(jLabel_RPCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jComboBox_RPCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_RPCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(jComboBox_RPCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 140, -1));

        jLabel_RLCV.setText("Referencia Laboral");
        jPanel_MantenimientoCV.add(jLabel_RLCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jComboBox_RLCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_RLCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(jComboBox_RLCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        jLabel_ELCV.setText("Experiencia Laboral");
        jPanel_MantenimientoCV.add(jLabel_ELCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jComboBox_ELCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ELCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(jComboBox_ELCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, -1));

        jLabel_MedioCV.setText("Medio");
        jPanel_MantenimientoCV.add(jLabel_MedioCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jComboBox_MedioCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_MedioCVActionPerformed(evt);
            }
        });
        jPanel_MantenimientoCV.add(jComboBox_MedioCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 140, -1));

        jLabel_Insertar_CV.setText("Insertar");
        jLabel_Insertar_CV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_CVMouseClicked(evt);
            }
        });
        jPanel_MantenimientoCV.add(jLabel_Insertar_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        jLabel_Modificar_CV.setText("Modificar");
        jLabel_Modificar_CV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_CVMouseClicked(evt);
            }
        });
        jPanel_MantenimientoCV.add(jLabel_Modificar_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jLabel_Eliminar_CV.setText("Eliminar");
        jLabel_Eliminar_CV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_CVMouseClicked(evt);
            }
        });
        jPanel_MantenimientoCV.add(jLabel_Eliminar_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));

        jLabel_Buscar_CV.setText("Buscar");
        jPanel_MantenimientoCV.add(jLabel_Buscar_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        txt_Buscar_CV.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_CV.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_CV.setBorder(null);
        txt_Buscar_CV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_CVActionPerformed(evt);
            }
        });
        txt_Buscar_CV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_CVKeyReleased(evt);
            }
        });
        jPanel_MantenimientoCV.add(txt_Buscar_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 290, 20));

        tbl_CV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_CV.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_CV.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_CV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CVMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(tbl_CV);

        jPanel_MantenimientoCV.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 730, 190));
        jPanel_MantenimientoCV.add(jLabel_NivelA_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 30, 20));
        jPanel_MantenimientoCV.add(jLabel_RL_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 30, 20));
        jPanel_MantenimientoCV.add(jLabel_EL_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, 20));
        jPanel_MantenimientoCV.add(jLabel_Correo_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 30, 20));
        jPanel_MantenimientoCV.add(jLabel_RP_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 30, 20));
        jPanel_MantenimientoCV.add(jLabel_Medio_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 30, 20));

        jPanel_RRHH.add(jPanel_MantenimientoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientoAPP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoAPP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_APP.setText("ID Aplicacion Prueba");
        jPanel_MantenimientoAPP.add(jLabel_ID_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        txt_id_APP.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_APP.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_APP.setBorder(null);
        txt_id_APP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_APPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAPP.add(txt_id_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, 20));

        jLabel_PruebaAPP.setText("Prueba");
        jPanel_MantenimientoAPP.add(jLabel_PruebaAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));
        jPanel_MantenimientoAPP.add(jLabel_Prueba_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 30, 20));

        jComboBox_PruebaAPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PruebaAPPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAPP.add(jComboBox_PruebaAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 140, -1));

        jLabel_AplicacionAPP.setText("Aplicacion");
        jPanel_MantenimientoAPP.add(jLabel_AplicacionAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));
        jPanel_MantenimientoAPP.add(jLabel_Aplicacion_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 30, 20));

        jComboBox_AplicacionAPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AplicacionAPPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAPP.add(jComboBox_AplicacionAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 140, -1));

        jLabel_EstatusAPP.setText("Estatus Aplicacion Prueba");
        jPanel_MantenimientoAPP.add(jLabel_EstatusAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        txt_AplicacionAPP.setBackground(new java.awt.Color(231, 231, 231));
        txt_AplicacionAPP.setForeground(new java.awt.Color(153, 153, 153));
        txt_AplicacionAPP.setBorder(null);
        txt_AplicacionAPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AplicacionAPPActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAPP.add(txt_AplicacionAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 170, 20));

        jLabel_Ingresar_APP.setText("Ingresar");
        jLabel_Ingresar_APP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Ingresar_APP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Ingresar_APPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAPP.add(jLabel_Ingresar_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 50, 40));

        jLabel_ModificarAPP.setText("Modificar");
        jLabel_ModificarAPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ModificarAPPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAPP.add(jLabel_ModificarAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 60, 20));

        jLabel_Eliminar_APP.setText("Eliminar");
        jLabel_Eliminar_APP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_APPMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAPP.add(jLabel_Eliminar_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 50, 20));

        jLabel_Buscar_APP.setText("Buscar");
        jPanel_MantenimientoAPP.add(jLabel_Buscar_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        txt_Buscar_APP.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_APP.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_APP.setBorder(null);
        txt_Buscar_APP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_APPActionPerformed(evt);
            }
        });
        txt_Buscar_APP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_APPKeyReleased(evt);
            }
        });
        jPanel_MantenimientoAPP.add(txt_Buscar_APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 290, 20));

        tbl_APP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_APP.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_APP.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_APP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_APPMouseClicked(evt);
            }
        });
        jScrollPane33.setViewportView(tbl_APP);

        jPanel_MantenimientoAPP.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientoS.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_IDS.setText("ID Seleccion");
        jPanel_MantenimientoS.add(jLabel_IDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        txt_idS.setBackground(new java.awt.Color(231, 231, 231));
        txt_idS.setForeground(new java.awt.Color(153, 153, 153));
        txt_idS.setBorder(null);
        txt_idS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idSActionPerformed(evt);
            }
        });
        jPanel_MantenimientoS.add(txt_idS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 20));

        jLabel_APPS.setText("Aplicacion Prueba");
        jPanel_MantenimientoS.add(jLabel_APPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jComboBox_APPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_APPSActionPerformed(evt);
            }
        });
        jPanel_MantenimientoS.add(jComboBox_APPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 140, -1));
        jPanel_MantenimientoS.add(jLabel_RL_APPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 30, 20));

        jLabel_EstatusS.setText("Estatus Seleccion");
        jPanel_MantenimientoS.add(jLabel_EstatusS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        txt_EstatusS.setBackground(new java.awt.Color(231, 231, 231));
        txt_EstatusS.setForeground(new java.awt.Color(153, 153, 153));
        txt_EstatusS.setBorder(null);
        txt_EstatusS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EstatusSActionPerformed(evt);
            }
        });
        jPanel_MantenimientoS.add(txt_EstatusS, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 140, 20));

        jLabel_InsertarS.setText("Insertar");
        jLabel_InsertarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_InsertarSMouseClicked(evt);
            }
        });
        jPanel_MantenimientoS.add(jLabel_InsertarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        jLabel_ModificarS.setText("Modificar");
        jLabel_ModificarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ModificarSMouseClicked(evt);
            }
        });
        jPanel_MantenimientoS.add(jLabel_ModificarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        jLabel_EliminarS.setText("Eliminar");
        jLabel_EliminarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EliminarSMouseClicked(evt);
            }
        });
        jPanel_MantenimientoS.add(jLabel_EliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel_BuscarS.setText("Buscar");
        jLabel_BuscarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarSMouseClicked(evt);
            }
        });
        jPanel_MantenimientoS.add(jLabel_BuscarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 50, 20));

        txt_BuscarS.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarS.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarS.setBorder(null);
        txt_BuscarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarSActionPerformed(evt);
            }
        });
        txt_BuscarS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarSKeyReleased(evt);
            }
        });
        jPanel_MantenimientoS.add(txt_BuscarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 240, 20));

        tbl_S.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_S.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_S.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SMouseClicked(evt);
            }
        });
        jScrollPane34.setViewportView(tbl_S);

        jPanel_MantenimientoS.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jPanel_MantenimientoA.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_A.setText("ID Actividad");
        jPanel_MantenimientoA.add(jLabel_ID_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        txt_id_A.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_A.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_A.setBorder(null);
        txt_id_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_AActionPerformed(evt);
            }
        });
        jPanel_MantenimientoA.add(txt_id_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, 20));

        jLabel_TA.setText("Tipo Actividad");
        jPanel_MantenimientoA.add(jLabel_TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        txt_TA.setBackground(new java.awt.Color(231, 231, 231));
        txt_TA.setForeground(new java.awt.Color(153, 153, 153));
        txt_TA.setBorder(null);
        txt_TA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TAActionPerformed(evt);
            }
        });
        jPanel_MantenimientoA.add(txt_TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 140, 20));

        jLabel_DescripcionA.setText("Descripcion Actividad");
        jPanel_MantenimientoA.add(jLabel_DescripcionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jTextArea_DescripcionA.setColumns(20);
        jTextArea_DescripcionA.setRows(5);
        jTextArea_DescripcionA.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jScrollPane3.setViewportView(jTextArea_DescripcionA);

        jPanel_MantenimientoA.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel_Insertar_A.setText("Insertar");
        jLabel_Insertar_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_AMouseClicked(evt);
            }
        });
        jPanel_MantenimientoA.add(jLabel_Insertar_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        jLabel_Modificar_Ac.setText("Modificar");
        jLabel_Modificar_Ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_AcMouseClicked(evt);
            }
        });
        jPanel_MantenimientoA.add(jLabel_Modificar_Ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        jLabel_Eliminar_Ac.setText("Eliminar");
        jLabel_Eliminar_Ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_AcMouseClicked(evt);
            }
        });
        jPanel_MantenimientoA.add(jLabel_Eliminar_Ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, -1));

        jLabel_BuscarA.setText("Buscar");
        jLabel_BuscarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarAMouseClicked(evt);
            }
        });
        jPanel_MantenimientoA.add(jLabel_BuscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 50, 20));

        txt_BuscarA.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarA.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarA.setBorder(null);
        txt_BuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarAActionPerformed(evt);
            }
        });
        txt_BuscarA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarAKeyReleased(evt);
            }
        });
        jPanel_MantenimientoA.add(txt_BuscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 240, 20));

        tbl_A.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_A.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_A.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_AMouseClicked(evt);
            }
        });
        jScrollPane35.setViewportView(tbl_A);

        jPanel_MantenimientoA.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 840));

        jPanel_MantenimientoAE.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientoAE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AE_EC.setText("Empleado Contratado");
        jPanel_MantenimientoAE.add(jLabel_AE_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));
        jPanel_MantenimientoAE.add(jLabel_AE_ECC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 30, 20));

        jComboBox_AE_EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AE_ECActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAE.add(jComboBox_AE_EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 140, -1));

        jLabel_Actividad_AE.setText("Actividad");
        jPanel_MantenimientoAE.add(jLabel_Actividad_AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));
        jPanel_MantenimientoAE.add(jLabel_Actividad_AEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 30, 20));

        jComboBox_Actividad_AE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Actividad_AEActionPerformed(evt);
            }
        });
        jPanel_MantenimientoAE.add(jComboBox_Actividad_AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 140, -1));

        jLabel_Insertar_AE.setText("Insertar");
        jLabel_Insertar_AE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_AEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAE.add(jLabel_Insertar_AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        jLabel_Modificar_AE.setText("Modificar");
        jLabel_Modificar_AE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_AEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAE.add(jLabel_Modificar_AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        jLabel_Eliminar_AE.setText("Eliminar");
        jLabel_Eliminar_AE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_AEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAE.add(jLabel_Eliminar_AE, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        jLabel_BuscarAE.setText("Buscar");
        jLabel_BuscarAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarAEMouseClicked(evt);
            }
        });
        jPanel_MantenimientoAE.add(jLabel_BuscarAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 50, 20));

        txt_BuscarAE.setBackground(new java.awt.Color(231, 231, 231));
        txt_BuscarAE.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarAE.setBorder(null);
        txt_BuscarAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarAEActionPerformed(evt);
            }
        });
        txt_BuscarAE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_BuscarAEKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarAEKeyReleased(evt);
            }
        });
        jPanel_MantenimientoAE.add(txt_BuscarAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 240, 20));

        tbl_AE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_AE.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_AE.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_AE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_AEMouseClicked(evt);
            }
        });
        jScrollPane39.setViewportView(tbl_AE);

        jPanel_MantenimientoAE.add(jScrollPane39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 600, 190));

        jPanel_RRHH.add(jPanel_MantenimientoAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 900));

        jPanel_MantenimientosP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_MantenimientosP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID_Puesto.setText("ID Puesto");
        jPanel_MantenimientosP.add(jLabel_ID_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        txt_id_Puesto.setBackground(new java.awt.Color(231, 231, 231));
        txt_id_Puesto.setForeground(new java.awt.Color(153, 153, 153));
        txt_id_Puesto.setBorder(null);
        txt_id_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_PuestoActionPerformed(evt);
            }
        });
        jPanel_MantenimientosP.add(txt_id_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 140, 20));

        jLabel_Nombre_Puesto.setText("Nombre Puesto");
        jPanel_MantenimientosP.add(jLabel_Nombre_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        txt_Nombre_Puesto.setBackground(new java.awt.Color(231, 231, 231));
        txt_Nombre_Puesto.setForeground(new java.awt.Color(153, 153, 153));
        txt_Nombre_Puesto.setBorder(null);
        txt_Nombre_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_PuestoActionPerformed(evt);
            }
        });
        jPanel_MantenimientosP.add(txt_Nombre_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 140, 20));

        jLabel_Descripcion_Puesto.setText("Descripcion Puesto");
        jPanel_MantenimientosP.add(jLabel_Descripcion_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel_Descripcion_Puesto1.setText("Estatus Puesto");
        jPanel_MantenimientosP.add(jLabel_Descripcion_Puesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        txt_Estatus_Puesto.setBackground(new java.awt.Color(231, 231, 231));
        txt_Estatus_Puesto.setForeground(new java.awt.Color(153, 153, 153));
        txt_Estatus_Puesto.setBorder(null);
        txt_Estatus_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Estatus_PuestoActionPerformed(evt);
            }
        });
        jPanel_MantenimientosP.add(txt_Estatus_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 140, 20));

        tbl_Puesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_Puesto.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_Puesto.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_Puesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PuestoMouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(tbl_Puesto);

        jPanel_MantenimientosP.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 600, 190));

        jLabel_Buscar_Puesto.setText("Buscar");
        jPanel_MantenimientosP.add(jLabel_Buscar_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        txt_Buscar_Puesto.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_Puesto.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_Puesto.setBorder(null);
        txt_Buscar_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_PuestoActionPerformed(evt);
            }
        });
        txt_Buscar_Puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_PuestoKeyReleased(evt);
            }
        });
        jPanel_MantenimientosP.add(txt_Buscar_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 290, 20));

        jLabel_Insertar_Puesto.setText("Insertar");
        jLabel_Insertar_Puesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Insertar_PuestoMouseClicked(evt);
            }
        });
        jPanel_MantenimientosP.add(jLabel_Insertar_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel_Modificar_Puesto.setText("Modificar");
        jLabel_Modificar_Puesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Modificar_PuestoMouseClicked(evt);
            }
        });
        jPanel_MantenimientosP.add(jLabel_Modificar_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabel_Eliminar_Puesto.setText("Eliminar");
        jLabel_Eliminar_Puesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Eliminar_PuestoMouseClicked(evt);
            }
        });
        jPanel_MantenimientosP.add(jLabel_Eliminar_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        txt_Descripcion_Puesto.setColumns(20);
        txt_Descripcion_Puesto.setRows(5);
        txt_Descripcion_Puesto.setAutoscrolls(false);
        jScrollPane4.setViewportView(txt_Descripcion_Puesto);

        jPanel_MantenimientosP.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 180, 100));

        jPanel_RRHH.add(jPanel_MantenimientosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1080, 800));

        getContentPane().add(jPanel_RRHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_MantenimientoPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoPMouseExited

    private void jLabel_ConsultarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarPMouseExited

    private void jLabel_ModificarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarPMouseExited

    private void jLabel_EliminarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarPMouseExited

    private void jLabel_MantenimientoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        jPanel_MantenimientosP.setVisible(true);
        Panel_MIMEC.setVisible(false);
        jLabel_Medio.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        Puesto puesto = new Puesto(txt_id_Puesto, txt_Nombre_Puesto, txt_Descripcion_Puesto, txt_Estatus_Puesto, txt_Buscar_Puesto, tbl_Puesto);
        puesto.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoPMouseClicked

    private void jLabel_MantenimientoPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPMouseMoved
        // TODO add your handling code here:
        Panel_PIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoPMouseMoved

    private void jLabel_ModificarPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarPMouseMoved
        // TODO add your handling code here:
        Panel_PIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarPMouseMoved

    private void Panel_PIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PIMECMouseExited
        // TODO add your handling code here:
        Panel_PIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_PIMECMouseExited

    private void Panel_PIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_PIMECMouseReleased

    private void Panel_PIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_PIMECMouseDragged

    private void jLabel_EliminarPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarPMouseMoved
        // TODO add your handling code here:
        Panel_PIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarPMouseMoved

    private void jLabel_ConsultarPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarPMouseMoved
        // TODO add your handling code here:
        Panel_PIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarPMouseMoved

    private void txt_id_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_DepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_DepartamentoActionPerformed

    private void txt_Nombre_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_DepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_DepartamentoActionPerformed

    private void txt_Estatus_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Estatus_DepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Estatus_DepartamentoActionPerformed

    private void jLabel_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarMouseClicked
        // TODO add your handling code here:
        Departamento De = new Departamento(txt_id_Departamento.toString(), txt_Nombre_Departamento.toString(), txt_Estatus_Departamento.toString());
        De.Insertar_Departamento(txt_id_Departamento, txt_Nombre_Departamento, txt_Estatus_Departamento, tbl_Departamento);
    }//GEN-LAST:event_jLabel_IngresarMouseClicked

    private void txt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarActionPerformed

    private void txt_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarKeyReleased
        // TODO add your handling code here:
        Departamento De = new Departamento(txt_id_Departamento.toString(), txt_Nombre_Departamento.toString(), txt_Estatus_Departamento.toString());
        De.Buscar_Departamento(txt_Buscar.getText(), tbl_Departamento);
    }//GEN-LAST:event_txt_BuscarKeyReleased

    private void jLabel_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarMouseClicked
        // TODO add your handling code here:
        Departamento De = new Departamento(txt_id_Departamento.toString(), txt_Nombre_Departamento.toString(), txt_Estatus_Departamento.toString());
        De.Modificar_Departamento(txt_id_Departamento, txt_Nombre_Departamento, txt_Estatus_Departamento, tbl_Departamento, txt_Buscar);
    }//GEN-LAST:event_jLabel_ModificarMouseClicked

    private void jLabel_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarMouseClicked
        // TODO add your handling code here:
        Departamento De = new Departamento(txt_id_Departamento.toString(), txt_Nombre_Departamento.toString(), txt_Estatus_Departamento.toString());
        De.Eliminar_Departamento(txt_id_Departamento, txt_Nombre_Departamento, txt_Estatus_Departamento, tbl_Departamento, txt_Buscar);
    }//GEN-LAST:event_jLabel_EliminarMouseClicked

    private void jLabel_PuestoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PuestoMouseMoved
        // TODO add your handling code here:
        Panel_PIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_PuestoMouseMoved

    private void jLabel_PuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PuestoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_PuestoMouseClicked

    private void jLabel_PuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PuestoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_PuestoMouseExited

    private void jLabel_PuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PuestoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_PuestoMousePressed

    private void jLabel_MantenimientoDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoDMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoDMouseMoved

    private void jLabel_MantenimientoDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoDMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        jPanel_MatenimientosD.setVisible(true);
        Panel_MIMEC.setVisible(false);
        jLabel_Medio.setVisible(false);
        Panel_PIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        Departamento De = new Departamento(txt_id_Departamento.toString(), txt_Nombre_Departamento.toString(), txt_Estatus_Departamento.toString());
        De.Actualizar_Tabla(tbl_Departamento);
    }//GEN-LAST:event_jLabel_MantenimientoDMouseClicked

    private void jLabel_MantenimientoDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoDMouseExited

    private void jLabel_ModificarDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarDMouseMoved
        // TODO add your handling code here:
        Panel_DIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarDMouseMoved

    private void jLabel_ModificarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarDMouseExited

    private void jLabel_EliminarDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarDMouseMoved
        // TODO add your handling code here:
        Panel_DIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarDMouseMoved

    private void jLabel_EliminarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarDMouseExited

    private void jLabel_ConsultarDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarDMouseMoved
        // TODO add your handling code here:
        Panel_DIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarDMouseMoved

    private void jLabel_ConsultarDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarDMouseExited

    private void Panel_DIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_DIMECMouseDragged

    private void Panel_DIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DIMECMouseExited
        // TODO add your handling code here:
        Panel_DIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_DIMECMouseExited

    private void Panel_DIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_DIMECMouseReleased

    private void jLabel_ModificarAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAMouseMoved
        // TODO add your handling code here:
        Panel_NAIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarAMouseMoved

    private void jLabel_ModificarAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarAMouseExited

    private void jLabel_EliminarAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAMouseMoved
        // TODO add your handling code here:
        Panel_NAIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarAMouseMoved

    private void jLabel_EliminarAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarAMouseExited

    private void jLabel_ConsultarAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAMouseMoved
        // TODO add your handling code here:
        Panel_NAIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarAMouseMoved

    private void jLabel_ConsultarAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarAMouseExited

    private void jLabel_MantenimientoAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAMouseMoved
        // TODO add your handling code here:
        Panel_NAIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoAMouseMoved

    private void jLabel_MantenimientoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        Nivel_Academico NA = new Nivel_Academico(txt_id_NivelA, txt_Nombre_NivelA, txt_Descripcion_NivelA, txt_Buscar_NivelA, tbl_NivelA);
        NA.Actualizar_Tabla();
        jPanel_MantenimientoNA.setVisible(true);

    }//GEN-LAST:event_jLabel_MantenimientoAMouseClicked

    private void jLabel_MantenimientoAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoAMouseExited

    private void Panel_NAIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_NAIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_NAIMECMouseDragged

    private void Panel_NAIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_NAIMECMouseExited
        // TODO add your handling code here:
        Panel_NAIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_NAIMECMouseExited

    private void Panel_NAIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_NAIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_NAIMECMouseReleased

    private void jLabel_NivelAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NivelAMouseMoved
        // TODO add your handling code here:
        Panel_NAIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_NivelAMouseMoved

    private void jLabel_NivelAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NivelAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel_NivelAMouseClicked

    private void jLabel_NivelAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NivelAMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_NivelAMouseExited

    private void jLabel_NivelAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NivelAMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_NivelAMousePressed

    private void txt_id_NivelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_NivelAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_NivelAActionPerformed

    private void txt_Nombre_NivelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_NivelAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_NivelAActionPerformed

    private void txt_Descripcion_NivelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Descripcion_NivelAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Descripcion_NivelAActionPerformed

    private void jLabel_Insertar_NivelAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_NivelAMouseClicked
        // TODO add your handling code here:
        Nivel_Academico NA = new Nivel_Academico(txt_id_NivelA, txt_Nombre_NivelA, txt_Descripcion_NivelA, txt_Buscar_NivelA, tbl_NivelA);
        NA.Insertar_NivelA();
    }//GEN-LAST:event_jLabel_Insertar_NivelAMouseClicked

    private void jLabel_Eliminar_NivelAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_NivelAMouseClicked
        // TODO add your handling code here:
        Nivel_Academico NA = new Nivel_Academico(txt_id_NivelA, txt_Nombre_NivelA, txt_Descripcion_NivelA, txt_Buscar_NivelA, tbl_NivelA);
        NA.Eliminar_NivelA();
    }//GEN-LAST:event_jLabel_Eliminar_NivelAMouseClicked

    private void jLabel_Modificar_NivelAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_NivelAMouseClicked
        // TODO add your handling code here:
        Nivel_Academico NA = new Nivel_Academico(txt_id_NivelA, txt_Nombre_NivelA, txt_Descripcion_NivelA, txt_Buscar_NivelA, tbl_NivelA);
        NA.Modificar_NivelA();
    }//GEN-LAST:event_jLabel_Modificar_NivelAMouseClicked

    private void txt_Buscar_NivelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_NivelAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_NivelAActionPerformed

    private void txt_Buscar_NivelAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_NivelAKeyReleased
        // TODO add your handling code here:
        Nivel_Academico NA = new Nivel_Academico(txt_id_NivelA, txt_Nombre_NivelA, txt_Descripcion_NivelA, txt_Buscar_NivelA, tbl_NivelA);
        NA.Buscar_NivelAF(txt_Buscar_NivelA.getText());
    }//GEN-LAST:event_txt_Buscar_NivelAKeyReleased

    private void jLabel_ExpLDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLDMouseMoved
        // TODO add your handling code here:
        Panel_ExpLDIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ExpLDMouseMoved

    private void jLabel_ExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ExpLDMouseClicked

    private void jLabel_ExpLDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ExpLDMouseExited

    private void jLabel_ExpLDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ExpLDMousePressed

    private void jLabel_ModificarExpLDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarExpLDMouseMoved
        // TODO add your handling code here:
        Panel_ExpLDIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarExpLDMouseMoved

    private void jLabel_ModificarExpLDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarExpLDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarExpLDMouseExited

    private void jLabel_EliminarExpLDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarExpLDMouseMoved
        // TODO add your handling code here:
        Panel_ExpLDIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarExpLDMouseMoved

    private void jLabel_EliminarExpLDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarExpLDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarExpLDMouseExited

    private void jLabel_ConsultarExpLDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarExpLDMouseMoved
        // TODO add your handling code here:
        Panel_ExpLDIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarExpLDMouseMoved

    private void jLabel_ConsultarExpLDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarExpLDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarExpLDMouseExited

    private void jLabel_MantenimientoExpLDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoExpLDMouseMoved
        // TODO add your handling code here:
        Panel_ExpLDIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoExpLDMouseMoved

    private void jLabel_MantenimientoExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoExpLDMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_Medio.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        jPanel_MantenimientoExpLD.setVisible(true);
        ExpLD.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoExpLDMouseClicked

    private void jLabel_MantenimientoExpLDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoExpLDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoExpLDMouseExited

    private void Panel_ExpLDIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLDIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExpLDIMECMouseDragged

    private void Panel_ExpLDIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLDIMECMouseExited
        // TODO add your handling code here:
        Panel_ExpLDIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_ExpLDIMECMouseExited

    private void Panel_ExpLDIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLDIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExpLDIMECMouseReleased

    private void txt_id_ExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ExpLDActionPerformed

    private void txt_NombreExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreExpLDActionPerformed

    private void txt_Nombre_EmpresaExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_EmpresaExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_EmpresaExpLDActionPerformed

    private void txt_Tiempo_InicioExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tiempo_InicioExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tiempo_InicioExpLDActionPerformed

    private void txt_Tiempo_FinalizacionExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tiempo_FinalizacionExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tiempo_FinalizacionExpLDActionPerformed

    private void jLabel_Insertar_ExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_ExpLDMouseClicked
        // TODO add your handling code here:
        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        ExpLD.Insertar_ExpLD();

    }//GEN-LAST:event_jLabel_Insertar_ExpLDMouseClicked

    private void jLabel_Modificar_ExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_ExpLDMouseClicked
        // TODO add your handling code here:
        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        ExpLD.Modificar_ExpLD();
    }//GEN-LAST:event_jLabel_Modificar_ExpLDMouseClicked

    private void jLabel_Eliminar_ExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_ExpLDMouseClicked
        // TODO add your handling code here:
        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        ExpLD.Eliminar_ExpLD();
    }//GEN-LAST:event_jLabel_Eliminar_ExpLDMouseClicked

    private void txt_Buscar_ExpLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_ExpLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_ExpLDActionPerformed

    private void txt_Buscar_ExpLDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_ExpLDKeyReleased
        // TODO add your handling code here:
        Experiencia_Laboral_Detallada ExpLD = new Experiencia_Laboral_Detallada(txt_id_ExpLD, txt_NombreExpLD, txt_Nombre_EmpresaExpLD, txt_Tiempo_InicioExpLD, txt_Tiempo_FinalizacionExpLD, txt_Buscar_ExpLD, tbl_ExpLD);
        ExpLD.Buscar_ExpLDF(txt_Buscar_ExpLD.getText());
    }//GEN-LAST:event_txt_Buscar_ExpLDKeyReleased

    private void jLabel_ExpLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLMouseMoved
        // TODO add your handling code here:
        Panel_ExpLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ExpLMouseMoved

    private void jLabel_ExpLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ExpLMouseClicked

    private void jLabel_ExpLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ExpLMouseExited

    private void jLabel_ExpLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExpLMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ExpLMousePressed

    private void jLabel_ModificarExpLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarExpLMouseMoved
        // TODO add your handling code here:
        Panel_ExpLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarExpLMouseMoved

    private void jLabel_ModificarExpLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarExpLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarExpLMouseExited

    private void jLabel_EliminarExpLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarExpLMouseMoved
        // TODO add your handling code here:
        Panel_ExpLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarExpLMouseMoved

    private void jLabel_EliminarExpLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarExpLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarExpLMouseExited

    private void jLabel_ConsultarExpLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarExpLMouseMoved
        // TODO add your handling code here:
        Panel_ExpLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarExpLMouseMoved

    private void jLabel_ConsultarExpLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarExpLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarExpLMouseExited

    private void jLabel_MantenimientoExpLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoExpLMouseMoved
        // TODO add your handling code here:
        Panel_ExpLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoExpLMouseMoved

    private void jLabel_MantenimientoExpLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoExpLMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_Medio.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        jPanel_MantenimientoExpL.setVisible(true);
        ExpL.Encontrar_ListaExpLD("explab_detallado", "nombre_tipo", jComboBox_Nombre_EpLLD);
        ExpL.Actualizar_Tabla();

    }//GEN-LAST:event_jLabel_MantenimientoExpLMouseClicked

    private void jLabel_MantenimientoExpLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoExpLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoExpLMouseExited

    private void Panel_ExpLIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExpLIMECMouseDragged

    private void Panel_ExpLIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLIMECMouseExited
        // TODO add your handling code here:
        Panel_ExpLIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_ExpLIMECMouseExited

    private void Panel_ExpLIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExpLIMECMouseReleased

    private void Panel_ExpLIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExpLIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ExpLIMECMouseMoved

    private void txt_id_ExpLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ExpLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ExpLActionPerformed

    private void jLabel_Insertar_ExpLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_ExpLMouseClicked
        // TODO add your handling code here:
        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        ExpL.Insertar_ExpL();
        ExpL.EncontrarID_ExpLD("id_tipoexp", "explab_detallado", "nombre_tipo", jComboBox_Nombre_EpLLD);
    }//GEN-LAST:event_jLabel_Insertar_ExpLMouseClicked

    private void jLabel_Modificar_ExpLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_ExpLMouseClicked
        // TODO add your handling code here:
        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        ExpL.Modificar_ExpL();
    }//GEN-LAST:event_jLabel_Modificar_ExpLMouseClicked

    private void jLabel_Eliminar_ExpLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_ExpLMouseClicked
        // TODO add your handling code here:
        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        ExpL.Eliminar_ExpL();
        ExpL.EncontrarID_ExpLD("id_tipoexp", "explab_detallado", "nombre_tipo", jComboBox_Nombre_EpLLD);
    }//GEN-LAST:event_jLabel_Eliminar_ExpLMouseClicked

    private void txt_Buscar_ExpLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_ExpLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_ExpLActionPerformed

    private void txt_Buscar_ExpLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_ExpLKeyReleased
        // TODO add your handling code here:
        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        ExpL.Buscar_ExpLF(txt_Buscar_ExpL.getText());
    }//GEN-LAST:event_txt_Buscar_ExpLKeyReleased

    private void jComboBox_Nombre_EpLLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Nombre_EpLLDActionPerformed
        // TODO add your handling code here:
        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        ExpL.EncontrarID_ExpLD("id_tipoexp", "explab_detallado", "nombre_tipo", jComboBox_Nombre_EpLLD);
    }//GEN-LAST:event_jComboBox_Nombre_EpLLDActionPerformed

    private void txt_id_SolicitudEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_SolicitudEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_SolicitudEActionPerformed

    private void txt_RangoEdadMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RangoEdadMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RangoEdadMActionPerformed

    private void txt_RangoEdadMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RangoEdadMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RangoEdadMaActionPerformed

    private void txt_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GeneroActionPerformed

    private void jComboBox_PuestoSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PuestoSEActionPerformed
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_puesto", "puesto", "nombre_puesto", jComboBox_PuestoSE, jLabel_Puesto_SE);
    }//GEN-LAST:event_jComboBox_PuestoSEActionPerformed

    private void jComboBox_DepartamentoSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DepartamentoSEActionPerformed
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_departamento", "departamento", "nombre_departamento", jComboBox_DepartamentoSE, jLabel_Departamento_SE);
    }//GEN-LAST:event_jComboBox_DepartamentoSEActionPerformed

    private void jComboBox_NivelASEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NivelASEActionPerformed
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_nivel_academico", "nivel_academico", "nombre_nivel", jComboBox_NivelASE, jLabel_NivelA_SE);
    }//GEN-LAST:event_jComboBox_NivelASEActionPerformed

    private void jComboBox_ExperienciaL_SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ExperienciaL_SEActionPerformed
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.EncontrarID_SE("id_experiencia", "experiencia_laboral", "id_tipoexp", jComboBox_ExperienciaL_SE, jLabel_ExperienciaL_SE);
    }//GEN-LAST:event_jComboBox_ExperienciaL_SEActionPerformed

    private void txt_Buscar_SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_SEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_SEActionPerformed

    private void txt_Buscar_SEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_SEKeyReleased
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Buscar_SolicitudE(txt_Buscar_SE.getText());

    }//GEN-LAST:event_txt_Buscar_SEKeyReleased

    private void jLabel_ModificarSEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarSEMouseMoved
        // TODO add your handling code here:
        Panel_SEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarSEMouseMoved

    private void jLabel_ModificarSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarSEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarSEMouseExited

    private void jLabel_EliminarSEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarSEMouseMoved
        // TODO add your handling code here:
        Panel_SEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarSEMouseMoved

    private void jLabel_EliminarSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarSEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarSEMouseExited

    private void jLabel_ConsultarSEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarSEMouseMoved
        // TODO add your handling code here:
        Panel_SEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarSEMouseMoved

    private void jLabel_ConsultarSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarSEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarSEMouseExited

    private void jLabel_MantenimientoSEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoSEMouseMoved
        // TODO add your handling code here:
        Panel_SEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoSEMouseMoved

    private void jLabel_MantenimientoSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoSEMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoSE.setVisible(true);
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Encontrar_ListaSE("puesto", "nombre_puesto", jComboBox_PuestoSE);
        SE.Encontrar_ListaSE("departamento", "nombre_departamento", jComboBox_DepartamentoSE);
        SE.Encontrar_ListaSE("nivel_academico", "nombre_nivel", jComboBox_NivelASE);
        SE.Encontrar_ListaSE("experiencia_laboral", "id_tipoexp", jComboBox_ExperienciaL_SE);

        SE.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoSEMouseClicked

    private void jLabel_MantenimientoSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoSEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoSEMouseExited

    private void Panel_SEIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SEIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SEIMECMouseDragged

    private void Panel_SEIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SEIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SEIMECMouseMoved

    private void Panel_SEIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SEIMECMouseExited
        // TODO add your handling code here:
        Panel_SEIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_SEIMECMouseExited

    private void Panel_SEIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SEIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SEIMECMouseReleased

    private void jLabel_SolicitudEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SolicitudEMouseMoved
        // TODO add your handling code here:
        Panel_SEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_SolicitudEMouseMoved

    private void jLabel_IngresarSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarSEMouseClicked
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Insertar_SE();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_IngresarSEMouseClicked

    private void jLabel_Modificar_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_SEMouseClicked
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Modificar_SE();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_SEMouseClicked

    private void jLabel_Eliminar_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_SEMouseClicked
        // TODO add your handling code here:
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.Eliminar_SE();
        SE.EncontrarID_SE("id_puesto", "puesto", "nombre_puesto", jComboBox_PuestoSE, jLabel_Puesto_SE);
        SE.EncontrarID_SE("id_departamento", "departamento", "nombre_departamento", jComboBox_DepartamentoSE, jLabel_Departamento_SE);
        SE.EncontrarID_SE("id_nivel_academico", "nivel_academico", "nombre_nivel", jComboBox_NivelASE, jLabel_NivelA_SE);
        SE.EncontrarID_SE("id_experiencia", "experiencia_laboral", "id_tipoexp", jComboBox_ExperienciaL_SE, jLabel_ExperienciaL_SE);


    }//GEN-LAST:event_jLabel_Eliminar_SEMouseClicked

    private void txt_id_MedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_MedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_MedioActionPerformed

    private void jComboBox_IDSEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_IDSEMActionPerformed
        // TODO add your handling code here:
        Medio M = new Medio(txt_id_Medio, jLabel_ID_SEM, txt_NombreM, jTextArea_DescripcionM, txt_BuscarM, tbl_Medio);
        M.EncontrarID_M("id_solicitud", "solicitud_empresarial", "id_solicitud", jComboBox_IDSEM, jLabel_ID_SEM);
    }//GEN-LAST:event_jComboBox_IDSEMActionPerformed

    private void txt_NombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreMActionPerformed

    private void txt_BuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarMActionPerformed

    private void txt_BuscarMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarMKeyReleased
        // TODO add your handling code here:
        Medio M = new Medio(txt_id_Medio, jLabel_ID_SEM, txt_NombreM, jTextArea_DescripcionM, txt_BuscarM, tbl_Medio);
        M.Buscar_SolicitudM(txt_BuscarM.getText());
    }//GEN-LAST:event_txt_BuscarMKeyReleased

    private void jLabel_IngresarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarMMouseClicked
        // TODO add your handling code here:
        Medio M = new Medio(txt_id_Medio, jLabel_ID_SEM, txt_NombreM, jTextArea_DescripcionM, txt_BuscarM, tbl_Medio);
        M.Insertar_Me();
    }//GEN-LAST:event_jLabel_IngresarMMouseClicked

    private void jLabel_ModificarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarMMouseClicked
        // TODO add your handling code here:
        //modificar
        Medio M = new Medio(txt_id_Medio, jLabel_ID_SEM, txt_NombreM, jTextArea_DescripcionM, txt_BuscarM, tbl_Medio);
        M.Modificar_SE();
    }//GEN-LAST:event_jLabel_ModificarMMouseClicked

    private void jLabel_EliminarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarMMouseClicked
        // TODO add your handling code here:
        Medio M = new Medio(txt_id_Medio, jLabel_ID_SEM, txt_NombreM, jTextArea_DescripcionM, txt_BuscarM, tbl_Medio);
        M.Eliminar_SE();
        M.EncontrarID_M("id_solicitud", "solicitud_empresarial", "id_solicitud", jComboBox_IDSEM, jLabel_ID_SEM);
    }//GEN-LAST:event_jLabel_EliminarMMouseClicked

    private void jLabel_MedioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MedioMouseMoved
        // TODO add your handling code here:
        Panel_MIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MedioMouseMoved

    private void jLabel_Modificar_MMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_MMouseMoved
        // TODO add your handling code here:
        Panel_MIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Modificar_MMouseMoved

    private void jLabel_Modificar_MMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_MMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_MMouseExited

    private void jLabel_Eliminar_MMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_MMouseMoved
        // TODO add your handling code here:
        Panel_MIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Eliminar_MMouseMoved

    private void jLabel_Eliminar_MMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_MMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Eliminar_MMouseExited

    private void jLabel_ConsultarMMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarMMouseMoved
        // TODO add your handling code here:
        Panel_MIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarMMouseMoved

    private void jLabel_ConsultarMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarMMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarMMouseExited

    private void jLabel_MantenimientoMMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoMMouseMoved
        // TODO add your handling code here:
        Panel_MIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoMMouseMoved

    private void jLabel_MantenimientoMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoMMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_Mantenimiento_Medio.setVisible(true);

        Medio M = new Medio(txt_id_Medio, jLabel_ID_SEM, txt_NombreM, jTextArea_DescripcionM, txt_BuscarM, tbl_Medio);
        M.Encontrar_ListaM("solicitud_empresarial", "id_solicitud", jComboBox_IDSEM);

        M.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoMMouseClicked

    private void jLabel_MantenimientoMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoMMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoMMouseExited

    private void Panel_MIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_MIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_MIMECMouseDragged

    private void Panel_MIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_MIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_MIMECMouseMoved

    private void Panel_MIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_MIMECMouseExited
        // TODO add your handling code here:
        Panel_MIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_MIMECMouseExited

    private void Panel_MIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_MIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_MIMECMouseReleased

    private void txt_id_ReferenciaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ReferenciaLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ReferenciaLActionPerformed

    private void txt_NombreRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreRLActionPerformed

    private void txt_TelefonoRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoRLActionPerformed

    private void jLabel_IngresarRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarRLMouseClicked
        // TODO add your handling code here:
        Referencias_Laborales referencias_Lab = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_Lab.Insertar_ReferenciasL();

    }//GEN-LAST:event_jLabel_IngresarRLMouseClicked

    private void jLabel_ModificarRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarRLMouseClicked
        // TODO add your handling code here:
        Referencias_Laborales referencias_Lab = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_Lab.Modificar_RefLab();
    }//GEN-LAST:event_jLabel_ModificarRLMouseClicked

    private void jLabel_EliminarRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarRLMouseClicked
        // TODO add your handling code here:
        Referencias_Laborales referencias_Lab = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_Lab.Eliminar_ReferenciasL();
    }//GEN-LAST:event_jLabel_EliminarRLMouseClicked

    private void txt_BuscarRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarRLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarRLActionPerformed

    private void txt_BuscarRLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarRLKeyReleased
        // TODO add your handling code here:
        Referencias_Laborales referencias_lab = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_lab.Buscar_ReferenciasLF(txt_BuscarRL.getText());
    }//GEN-LAST:event_txt_BuscarRLKeyReleased

    private void jLabel_RLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RLMouseMoved
        // TODO add your handling code here:
        Panel_RLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_RLMouseMoved

    private void jLabel_Modificar_RLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_RLMouseMoved
        // TODO add your handling code here:
        Panel_RLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Modificar_RLMouseMoved

    private void jLabel_Modificar_RLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_RLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_RLMouseExited

    private void jLabel_Eliminar_RLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_RLMouseMoved
        // TODO add your handling code here:
        Panel_RLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Eliminar_RLMouseMoved

    private void jLabel_Eliminar_RLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_RLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Eliminar_RLMouseExited

    private void jLabel_Consultar_RLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Consultar_RLMouseMoved
        // TODO add your handling code here:
        Panel_RLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Consultar_RLMouseMoved

    private void jLabel_Consultar_RLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Consultar_RLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Consultar_RLMouseExited

    private void jLabel_Mantenimiento_RLMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_RLMouseMoved
        // TODO add your handling code here:
        Panel_RLIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Mantenimiento_RLMouseMoved

    private void jLabel_Mantenimiento_RLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_RLMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoRL.setVisible(true);

        Referencias_Laborales referencias_laborales = new Referencias_Laborales(txt_id_ReferenciaL, txt_NombreRL, txt_TelefonoRL, txt_BuscarRL, tbl_RL);
        referencias_laborales.Actualizar_Tabla();

    }//GEN-LAST:event_jLabel_Mantenimiento_RLMouseClicked

    private void jLabel_Mantenimiento_RLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_RLMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Mantenimiento_RLMouseExited

    private void Panel_RLIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RLIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RLIMECMouseDragged

    private void Panel_RLIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RLIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RLIMECMouseMoved

    private void Panel_RLIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RLIMECMouseExited
        // TODO add your handling code here:
        Panel_RLIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_RLIMECMouseExited

    private void Panel_RLIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RLIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RLIMECMouseReleased

    private void Panel_SEIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SEIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SEIMECMouseClicked

    private void jLabel_BuscarRLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarRLMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel_BuscarRLMouseClicked

    private void jLabel_DepartamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DepartamentoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_DepartamentoMousePressed

    private void jLabel_DepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DepartamentoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_DepartamentoMouseExited

    private void jLabel_DepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DepartamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_DepartamentoMouseClicked

    private void jLabel_DepartamentoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DepartamentoMouseMoved
        // TODO add your handling code here:
        Panel_DIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_DepartamentoMouseMoved

    private void tbl_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SEMouseClicked
        int Seleccion = tbl_SE.rowAtPoint(evt.getPoint());
        txt_id_SolicitudE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 0)));
        txt_RangoEdadM.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 1)));
        txt_RangoEdadMa.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 2)));
        txt_Genero.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 3)));
        jTextArea_DescripcionSE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 8)));
        jLabel_Puesto_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 4)));
        jLabel_Departamento_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 5)));
        jLabel_NivelA_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 6)));
        jLabel_ExperienciaL_SE.setText(String.valueOf(tbl_SE.getValueAt(Seleccion, 7)));
        Solicitud_Empresarial SE = new Solicitud_Empresarial(txt_id_SolicitudE, txt_RangoEdadM, txt_RangoEdadMa, txt_Genero, jLabel_Puesto_SE, jLabel_Departamento_SE, jLabel_NivelA_SE, jLabel_ExperienciaL_SE, jTextArea_DescripcionSE, txt_Buscar_SE, tbl_SE);
        SE.BuscarFila_SE("nombre_puesto", "puesto", "id_puesto", jComboBox_PuestoSE, jLabel_Puesto_SE);
        SE.BuscarFila_SE("nombre_departamento", "departamento", "id_departamento", jComboBox_DepartamentoSE, jLabel_Departamento_SE);
        SE.BuscarFila_SE("nombre_nivel", "nivel_academico", "id_nivel_academico", jComboBox_NivelASE, jLabel_NivelA_SE);
        SE.BuscarFila_SE("id_tipoexp", "experiencia_laboral", "id_experiencia", jComboBox_ExperienciaL_SE, jLabel_ExperienciaL_SE);
    }//GEN-LAST:event_tbl_SEMouseClicked

    private void txt_Buscar_SEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Buscar_SEMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_SEMousePressed

    private void txt_Buscar_SEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Buscar_SEMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_SEMouseReleased

    private void jLabel_Puesto_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Puesto_SEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Puesto_SEMouseClicked

    private void jLabel_BuscarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarMMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarMMouseClicked

    private void jLabel_Buscar_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Buscar_SEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Buscar_SEMouseClicked

    private void jLabel_ReferenciasPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReferenciasPMouseMoved
        // TODO add your handling code here:
        Panel_RPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ReferenciasPMouseMoved

    private void jLabel_ModificarRPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarRPMouseMoved
        // TODO add your handling code here:
        Panel_RPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarRPMouseMoved

    private void jLabel_ModificarRPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarRPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarRPMouseExited

    private void jLabel_EliminarRPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarRPMouseMoved
        // TODO add your handling code here:
        Panel_RPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarRPMouseMoved

    private void jLabel_EliminarRPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarRPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarRPMouseExited

    private void jLabel_ConsultarRPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarRPMouseMoved
        // TODO add your handling code here:
        Panel_RPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarRPMouseMoved

    private void jLabel_ConsultarRPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarRPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarRPMouseExited

    private void jLabel_MantenimientoRPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoRPMouseMoved
        // TODO add your handling code here:
        Panel_RPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoRPMouseMoved

    private void jLabel_MantenimientoRPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoRPMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientosRP.setVisible(true);
        Referencias_Personales RP = new Referencias_Personales(txt_id_RP, txt_Nombre_RP, txt_Telefono_RP, txt_Buscar_RP, tbl_RP);
        RP.Actualizar_Tabla();

    }//GEN-LAST:event_jLabel_MantenimientoRPMouseClicked

    private void jLabel_MantenimientoRPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoRPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoRPMouseExited

    private void Panel_RPIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RPIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RPIMECMouseDragged

    private void Panel_RPIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RPIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RPIMECMouseMoved

    private void Panel_RPIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RPIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RPIMECMouseClicked

    private void Panel_RPIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RPIMECMouseExited
        // TODO add your handling code here:
        Panel_RPIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_RPIMECMouseExited

    private void Panel_RPIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RPIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_RPIMECMouseReleased

    private void txt_id_RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_RPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_RPActionPerformed

    private void txt_Nombre_RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_RPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_RPActionPerformed

    private void txt_Telefono_RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Telefono_RPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Telefono_RPActionPerformed

    private void jLabel_Insertar_RPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_RPMouseClicked
        // TODO add your handling code here:
        Referencias_Personales RP = new Referencias_Personales(txt_id_RP, txt_Nombre_RP, txt_Telefono_RP, txt_Buscar_RP, tbl_RP);
        RP.Insertar_ReferenciasP();
    }//GEN-LAST:event_jLabel_Insertar_RPMouseClicked

    private void jLabel_Modificar_RPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_RPMouseClicked
        // TODO add your handling code here:
        //MODIFICAAAR
        Referencias_Personales RP = new Referencias_Personales(txt_id_RP, txt_Nombre_RP, txt_Telefono_RP, txt_Buscar_RP, tbl_RP);
        RP.Modificar_RefPer();
    }//GEN-LAST:event_jLabel_Modificar_RPMouseClicked

    private void jLabel_Eliminar_RPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_RPMouseClicked
        // TODO add your handling code here:
        //ELIMINARRRRR
        Referencias_Personales RP = new Referencias_Personales(txt_id_RP, txt_Nombre_RP, txt_Telefono_RP, txt_Buscar_RP, tbl_RP);
        RP.Eliminar_ReferenciasP();
    }//GEN-LAST:event_jLabel_Eliminar_RPMouseClicked

    private void txt_Buscar_RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_RPActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_txt_Buscar_RPActionPerformed

    private void txt_Buscar_RPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_RPKeyReleased
        // TODO add your handling code here:
        Referencias_Personales RP = new Referencias_Personales(txt_id_RP, txt_Nombre_RP, txt_Telefono_RP, txt_Buscar_RP, tbl_RP);
        RP.Buscar_ReferenciasP(txt_Buscar_RP.getText());
    }//GEN-LAST:event_txt_Buscar_RPKeyReleased

    private void jLabel_CVMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CVMouseMoved
        // TODO add your handling code here:
        Panel_CVIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_CVMouseMoved

    private void jLabel_ModificarCVMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarCVMouseMoved
        // TODO add your handling code here:
        Panel_CVIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarCVMouseMoved

    private void jLabel_ModificarCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarCVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarCVMouseExited

    private void jLabel_EliminarCVMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarCVMouseMoved
        // TODO add your handling code here:
        Panel_CVIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarCVMouseMoved

    private void jLabel_EliminarCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarCVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarCVMouseExited

    private void jLabel_ConsultarCVMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarCVMouseMoved
        // TODO add your handling code here:
        Panel_CVIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarCVMouseMoved

    private void jLabel_ConsultarCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarCVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarCVMouseExited

    private void jLabel_MantenimientoCVMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoCVMouseMoved
        // TODO add your handling code here:
        Panel_CVIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoCVMouseMoved

    private void jLabel_MantenimientoCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoCVMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoCV.setVisible(true);

        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Encontrar_ListaCV("nivel_academico", "nombre_nivel", jComboBox_NivelACV);
        CV.Encontrar_ListaCV("referenciasp", "nombre_personaP", jComboBox_RPCV);
        CV.Encontrar_ListaCV("referenciasl", "nombre_personaL", jComboBox_RLCV);
        CV.Encontrar_ListaCV("experiencia_laboral", "id_tipoexp", jComboBox_ELCV);
        CV.Encontrar_ListaCV("medio", "nombre_medio", jComboBox_MedioCV);

        CV.Actualizar_Tabla();

    }//GEN-LAST:event_jLabel_MantenimientoCVMouseClicked

    private void jLabel_MantenimientoCVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoCVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoCVMouseExited

    private void Panel_CVIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CVIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CVIMECMouseDragged

    private void Panel_CVIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CVIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CVIMECMouseMoved

    private void Panel_CVIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CVIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CVIMECMouseClicked

    private void Panel_CVIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CVIMECMouseExited
        // TODO add your handling code here:
        Panel_CVIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_CVIMECMouseExited

    private void Panel_CVIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CVIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CVIMECMouseReleased

    private void jLabel_MantenimientoRPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoRPKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoRPKeyPressed

    private void txt_DPICVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DPICVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DPICVActionPerformed

    private void txt_NombreCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreCVActionPerformed

    private void txt_ApellidoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoCVActionPerformed

    private void txt_TelefonoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoCVActionPerformed

    private void txt_CorreoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CorreoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CorreoCVActionPerformed

    private void txt_DireccionCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DireccionCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DireccionCVActionPerformed

    private void txt_GeneroCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeneroCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GeneroCVActionPerformed

    private void txt_EdadCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EdadCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EdadCVActionPerformed

    private void jComboBox_NivelACVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NivelACVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_nivel_academico", "nivel_academico", "nombre_nivel", jComboBox_NivelACV, jLabel_NivelA_CV);
    }//GEN-LAST:event_jComboBox_NivelACVActionPerformed

    private void jComboBox_RPCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_RPCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_referenciaP", "referenciasp", "nombre_personaP", jComboBox_RPCV, jLabel_RP_CV);
    }//GEN-LAST:event_jComboBox_RPCVActionPerformed

    private void jComboBox_RLCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_RLCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_referenciaL", "referenciasl", "nombre_personaL", jComboBox_RLCV, jLabel_RL_CV);
    }//GEN-LAST:event_jComboBox_RLCVActionPerformed

    private void jComboBox_ELCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ELCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_experiencia", "experiencia_laboral", "id_tipoexp", jComboBox_ELCV, jLabel_EL_CV);
    }//GEN-LAST:event_jComboBox_ELCVActionPerformed

    private void jComboBox_MedioCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_MedioCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_medio", "medio", "nombre_medio", jComboBox_MedioCV, jLabel_Medio_CV);
    }//GEN-LAST:event_jComboBox_MedioCVActionPerformed

    private void jLabel_Insertar_CVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_CVMouseClicked
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Insertar_C();

    }//GEN-LAST:event_jLabel_Insertar_CVMouseClicked

    private void jLabel_Modificar_CVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_CVMouseClicked
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Modificar_C();
    }//GEN-LAST:event_jLabel_Modificar_CVMouseClicked

    private void jLabel_Eliminar_CVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_CVMouseClicked
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Eliminar_C();
        CV.EncontrarID_CV("id_nivel_academico", "nivel_academico", "nombre_nivel", jComboBox_NivelACV, jLabel_NivelA_CV);
        CV.EncontrarID_CV("id_referenciaP", "referenciasp", "nombre_personaP", jComboBox_RPCV, jLabel_RP_CV);
        CV.EncontrarID_CV("id_referenciaL", "referenciasl", "nombre_personaL", jComboBox_RLCV, jLabel_RL_CV);
        CV.EncontrarID_CV("id_experiencia", "experiencia_laboral", "id_tipoexp", jComboBox_ELCV, jLabel_EL_CV);
        CV.EncontrarID_CV("id_medio", "medio", "nombre_medio", jComboBox_MedioCV, jLabel_Medio_CV);
    }//GEN-LAST:event_jLabel_Eliminar_CVMouseClicked

    private void txt_Buscar_CVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_CVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_CVActionPerformed

    private void txt_Buscar_CVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_CVKeyReleased
        // TODO add your handling code here:
        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Buscar_SolicitudCV(txt_Buscar_CV.getText());
    }//GEN-LAST:event_txt_Buscar_CVKeyReleased

    private void jLabel_APMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_APMouseMoved
        // TODO add your handling code here:
        Panel_APIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_APMouseMoved

    private void jLabel_ModificarAPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAPMouseMoved
        // TODO add your handling code here:
        Panel_APIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarAPMouseMoved

    private void jLabel_ModificarAPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarAPMouseExited

    private void jLabel_EliminarAPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAPMouseMoved
        // TODO add your handling code here:
        Panel_APIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarAPMouseMoved

    private void jLabel_EliminarAPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarAPMouseExited

    private void jLabel_ConsultarAPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAPMouseMoved
        // TODO add your handling code here:
        Panel_APIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarAPMouseMoved

    private void jLabel_ConsultarAPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarAPMouseExited

    private void jLabel_MantenimientoAPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAPMouseMoved
        // TODO add your handling code here:
        Panel_APIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoAPMouseMoved

    private void jLabel_MantenimientoAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAPMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoAP.setVisible(true);

        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.Encontrar_ListaAplicacion("curriculum", "nombres_persona", jComboBox_DPIAP);
        ap.Actualizar_Tabla();

    }//GEN-LAST:event_jLabel_MantenimientoAPMouseClicked

    private void jLabel_MantenimientoAPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoAPMouseExited

    private void Panel_APIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APIMECMouseDragged

    private void Panel_APIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APIMECMouseMoved

    private void Panel_APIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APIMECMouseClicked

    private void Panel_APIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APIMECMouseExited
        // TODO add your handling code here:
        Panel_APIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_APIMECMouseExited

    private void Panel_APIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APIMECMouseReleased

    private void txt_id_APActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_APActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_APActionPerformed

    private void jComboBox_DPIAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DPIAPActionPerformed
        // TODO add your handling code here:
        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.EncontrarID_dpi("dpi_persona", "curriculum", "nombres_persona", jComboBox_DPIAP, jLabel_DPI_AP);
    }//GEN-LAST:event_jComboBox_DPIAPActionPerformed

    private void txt_RequisitosAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RequisitosAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RequisitosAPActionPerformed

    private void jLabel_IngresarAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarAPMouseClicked
        // TODO add your handling code here:
        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.Insertar_Aplicacion();
    }//GEN-LAST:event_jLabel_IngresarAPMouseClicked

    private void jLabel_Modificar_APMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_APMouseClicked
        // TODO add your handling code here:
        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.Modificar_Aplicacion();
    }//GEN-LAST:event_jLabel_Modificar_APMouseClicked

    private void jLabel_Eliminar_APMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_APMouseClicked
        // TODO add your handling code here:
        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.Eliminar_Aplicacion();
    }//GEN-LAST:event_jLabel_Eliminar_APMouseClicked

    private void txt_BuscarAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarAPActionPerformed

    private void txt_BuscarAPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarAPKeyReleased
        // TODO add your handling code here:
        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.Buscar_AplicacionE(txt_BuscarAP.getText());
    }//GEN-LAST:event_txt_BuscarAPKeyReleased

    private void jLabel_BuscarAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarAPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarAPMouseClicked

    private void jLabel_TipoPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_TipoPMouseMoved
        // TODO add your handling code here:
        Panel_TPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_TipoPMouseMoved

    private void jLabel_ModificarTPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarTPMouseMoved
        // TODO add your handling code here:
        Panel_TPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarTPMouseMoved

    private void jLabel_ModificarTPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarTPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarTPMouseExited

    private void jLabel_EliminarTPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarTPMouseMoved
        // TODO add your handling code here:
        Panel_TPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarTPMouseMoved

    private void jLabel_EliminarTPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarTPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarTPMouseExited

    private void jLabel_ConsultarTPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarTPMouseMoved
        // TODO add your handling code here:
        Panel_TPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarTPMouseMoved

    private void jLabel_ConsultarTPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarTPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarTPMouseExited

    private void jLabel_MantenimientoTPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoTPMouseMoved
        // TODO add your handling code here:
        Panel_TPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoTPMouseMoved

    private void jLabel_MantenimientoTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoTPMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_Tipo_Prueba.setVisible(true);
        Tipo_Prueba TP = new Tipo_Prueba(txt_id_TP, txt_TP, tbl_TP, txt_BuscarTP);
        TP.Actualizar_Tabla();

    }//GEN-LAST:event_jLabel_MantenimientoTPMouseClicked

    private void jLabel_MantenimientoTPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoTPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoTPMouseExited

    private void Panel_TPIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TPIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_TPIMECMouseDragged

    private void Panel_TPIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TPIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_TPIMECMouseMoved

    private void Panel_TPIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TPIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_TPIMECMouseClicked

    private void Panel_TPIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TPIMECMouseExited
        // TODO add your handling code here:
        Panel_TPIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_TPIMECMouseExited

    private void Panel_TPIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TPIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_TPIMECMouseReleased

    private void txt_id_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_TPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_TPActionPerformed

    private void txt_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TPActionPerformed

    private void jLabel_IngresarTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarTPMouseClicked
        Tipo_Prueba TP = new Tipo_Prueba(txt_id_TP, txt_TP, tbl_TP, txt_BuscarTP);
        TP.Insertar_TipoPrueba();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_IngresarTPMouseClicked

    private void jLabel_Modificar_TPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_TPMouseClicked
        // TODO add your handling code here:
        Tipo_Prueba TP = new Tipo_Prueba(txt_id_TP, txt_TP, tbl_TP, txt_BuscarTP);
        TP.Modificar_TipoPrueba();

    }//GEN-LAST:event_jLabel_Modificar_TPMouseClicked

    private void jLabel_Eliminar_TPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_TPMouseClicked
        Tipo_Prueba TP = new Tipo_Prueba(txt_id_TP, txt_TP, tbl_TP, txt_BuscarTP);
        TP.Eliminar_TipoPrueba();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Eliminar_TPMouseClicked

    private void txt_BuscarTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarTPActionPerformed
        Tipo_Prueba TP = new Tipo_Prueba(txt_id_TP, txt_TP, tbl_TP, txt_BuscarTP);
        TP.Buscar_TP(txt_BuscarTP.getText());
// TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarTPActionPerformed

    private void txt_BuscarTPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarTPKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarTPKeyReleased

    private void jLabel_BuscarTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarTPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarTPMouseClicked

    private void tbl_DepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DepartamentoMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_Departamento.rowAtPoint(evt.getPoint());
        txt_id_Departamento.setText(String.valueOf(tbl_Departamento.getValueAt(Seleccion, 0)));
        txt_Nombre_Departamento.setText(String.valueOf(tbl_Departamento.getValueAt(Seleccion, 1)));
        txt_Estatus_Departamento.setText(String.valueOf(tbl_Departamento.getValueAt(Seleccion, 2)));
    }//GEN-LAST:event_tbl_DepartamentoMouseClicked

    private void tbl_NivelAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NivelAMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_NivelA.rowAtPoint(evt.getPoint());
        txt_id_NivelA.setText(String.valueOf(tbl_NivelA.getValueAt(Seleccion, 0)));
        txt_Nombre_NivelA.setText(String.valueOf(tbl_NivelA.getValueAt(Seleccion, 1)));
        txt_Descripcion_NivelA.setText(String.valueOf(tbl_NivelA.getValueAt(Seleccion, 2)));
    }//GEN-LAST:event_tbl_NivelAMouseClicked

    private void tbl_ExpLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ExpLDMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_ExpLD.rowAtPoint(evt.getPoint());
        txt_id_ExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 0)));
        txt_NombreExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 1)));
        txt_Nombre_EmpresaExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 2)));
        txt_Tiempo_InicioExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 3)));
        txt_Tiempo_FinalizacionExpLD.setText(String.valueOf(tbl_ExpLD.getValueAt(Seleccion, 4)));
    }//GEN-LAST:event_tbl_ExpLDMouseClicked

    private void tbl_ExpLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ExpLMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_ExpL.rowAtPoint(evt.getPoint());
        txt_id_ExpL.setText(String.valueOf(tbl_ExpL.getValueAt(Seleccion, 0)));
        jLabel_id_Nombre_EpLLD.setText(String.valueOf(tbl_ExpL.getValueAt(Seleccion, 1)));

        Experiencia_Laboral ExpL = new Experiencia_Laboral(txt_id_ExpL, jLabel_id_Nombre_EpLLD, txt_Buscar_ExpL, tbl_ExpL);
        ExpL.BuscarFila_ExpL("nombre_tipo", "explab_detallado", "id_tipoexp", jComboBox_Nombre_EpLLD, jLabel_id_Nombre_EpLLD);
    }//GEN-LAST:event_tbl_ExpLMouseClicked

    private void jLabel_NivelA_SEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NivelA_SEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_NivelA_SEMouseClicked

    private void tbl_TPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TPMouseClicked
        int Seleccion = tbl_TP.rowAtPoint(evt.getPoint());
        txt_id_TP.setText(String.valueOf(tbl_TP.getValueAt(Seleccion, 0)));
        txt_TP.setText(String.valueOf(tbl_TP.getValueAt(Seleccion, 1)));

// TODO add your handling code here:
    }//GEN-LAST:event_tbl_TPMouseClicked

    private void tbl_APMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_APMouseClicked
        // TODO add your handling code here:

        int Seleccion = tbl_AP.rowAtPoint(evt.getPoint());

        txt_id_AP.setText(String.valueOf(tbl_AP.getValueAt(Seleccion, 0)));
        jLabel_DPI_AP.setText(String.valueOf(tbl_AP.getValueAt(Seleccion, 1)));
        txt_RequisitosAP.setText(String.valueOf(tbl_AP.getValueAt(Seleccion, 2)));

        Aplicacion ap = new Aplicacion(txt_id_AP, jLabel_DPI_AP, txt_RequisitosAP, txt_BuscarAP, tbl_AP);
        ap.BuscarFila_AP("nombres_persona", "curriculum", "dpi_persona", jComboBox_DPIAP, jLabel_DPI_AP);

    }//GEN-LAST:event_tbl_APMouseClicked

    private void tbl_RLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RLMouseClicked
        // TODO add your handling code here:

        int Seleccion = tbl_RL.rowAtPoint(evt.getPoint());

        txt_id_ReferenciaL.setText(String.valueOf(tbl_RL.getValueAt(Seleccion, 0)));
        txt_NombreRL.setText(String.valueOf(tbl_RL.getValueAt(Seleccion, 1)));
        txt_TelefonoRL.setText(String.valueOf(tbl_RL.getValueAt(Seleccion, 2)));

    }//GEN-LAST:event_tbl_RLMouseClicked

    private void tbl_CVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CVMouseClicked
        // TODO add your handling code here:

        int Seleccion = tbl_CV.rowAtPoint(evt.getPoint());

        txt_DPICV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 0)));
        txt_NombreCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 1)));
        txt_ApellidoCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 2)));
        txt_TelefonoCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 3)));
        txt_CorreoCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 4)));
        txt_DireccionCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 5)));
        txt_GeneroCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 6)));
        txt_EdadCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 7)));
        jLabel_NivelA_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 8)));
        jLabel_RP_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 9)));
        jLabel_RL_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 10)));
        jLabel_EL_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 11)));
        jLabel_Medio_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 12)));

        Curriculum CV = new Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.BuscarFila_CV("nombre_nivel", "nivel_academico", "id_nivel_academico", jComboBox_NivelACV, jLabel_NivelA_CV);
        CV.BuscarFila_CV("nombre_personaP", "referenciasP", "id_referenciaP", jComboBox_RPCV, jLabel_RP_CV);
        CV.BuscarFila_CV("nombre_personaL", "referenciasL", "id_referenciaL", jComboBox_RLCV, jLabel_RL_CV);
        CV.BuscarFila_CV("id_tipoexp", "experiencia_laboral", "id_tipoexp", jComboBox_ELCV, jLabel_EL_CV);
        CV.BuscarFila_CV("nombre_medio", "medio", "id_medio", jComboBox_MedioCV, jLabel_Medio_CV);
        //id_experiencia
    }//GEN-LAST:event_tbl_CVMouseClicked

    private void txt_id_APPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_APPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_APPActionPerformed

    private void jComboBox_PruebaAPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PruebaAPPActionPerformed
        // TODO add your handling code here:
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.EncontrarID_APP("id_prueba", "tipo_pruebas", "tipo_prueba", jComboBox_PruebaAPP, jLabel_Prueba_APP);

    }//GEN-LAST:event_jComboBox_PruebaAPPActionPerformed

    private void jComboBox_AplicacionAPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AplicacionAPPActionPerformed
        // TODO add your handling code here:
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.EncontrarID_APP("id_aplicacion", "aplicacion", "dpi_persona", jComboBox_AplicacionAPP, jLabel_Aplicacion_APP);
    }//GEN-LAST:event_jComboBox_AplicacionAPPActionPerformed

    private void txt_AplicacionAPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AplicacionAPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AplicacionAPPActionPerformed

    private void jLabel_Ingresar_APPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ingresar_APPMouseClicked
        // TODO add your handling code here:
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.Insertar_APP();

    }//GEN-LAST:event_jLabel_Ingresar_APPMouseClicked

    private void jLabel_ModificarAPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAPPMouseClicked
        // TODO add your handling code here:
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.Modificar_APP();
    }//GEN-LAST:event_jLabel_ModificarAPPMouseClicked

    private void jLabel_Eliminar_APPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_APPMouseClicked
        // TODO add your handling code here:
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.Eliminar_APP();
    }//GEN-LAST:event_jLabel_Eliminar_APPMouseClicked

    private void txt_Buscar_APPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_APPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_APPActionPerformed

    private void txt_Buscar_APPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_APPKeyReleased
        // TODO add your handling code here:
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.Buscar_APPF(txt_BuscarAE.getText());
    }//GEN-LAST:event_txt_Buscar_APPKeyReleased

    private void tbl_APPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_APPMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_APP.rowAtPoint(evt.getPoint());
        txt_id_APP.setText(String.valueOf(tbl_APP.getValueAt(Seleccion, 0)));
        jLabel_Prueba_APP.setText(String.valueOf(tbl_APP.getValueAt(Seleccion, 1)));
        jLabel_Aplicacion_APP.setText(String.valueOf(tbl_APP.getValueAt(Seleccion, 2)));
        txt_AplicacionAPP.setText(String.valueOf(tbl_APP.getValueAt(Seleccion, 3)));

        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.BuscarFila_APP("tipo_prueba", "tipo_pruebas", "id_prueba", jComboBox_PruebaAPP, jLabel_Prueba_APP);
        APP.BuscarFila_APP("dpi_persona", "aplicacion", "id_aplicacion", jComboBox_AplicacionAPP, jLabel_Aplicacion_APP);
    }//GEN-LAST:event_tbl_APPMouseClicked

    private void jLabel_APPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_APPMouseMoved
        // TODO add your handling code here:
        Panel_APPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_APPMouseMoved

    private void jLabel_Modificar_APPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_APPMouseMoved
        // TODO add your handling code here:
        Panel_APPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Modificar_APPMouseMoved

    private void jLabel_Modificar_APPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_APPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_APPMouseExited

    private void jLabel_EliminarAPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAPPMouseMoved
        // TODO add your handling code here:
        Panel_APPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarAPPMouseMoved

    private void jLabel_EliminarAPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAPPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarAPPMouseExited

    private void jLabel_ConsultarAPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAPPMouseMoved
        // TODO add your handling code here:
        Panel_APPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarAPPMouseMoved

    private void jLabel_ConsultarAPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAPPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarAPPMouseExited

    private void jLabel_Mantenimiento_APPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_APPMouseMoved
        // TODO add your handling code here:
        Panel_APPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Mantenimiento_APPMouseMoved

    private void jLabel_Mantenimiento_APPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_APPMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoAPP.setVisible(true);
        Aplicacion_Prueba APP = new Aplicacion_Prueba(txt_id_APP, jLabel_Prueba_APP, jLabel_Aplicacion_APP, txt_AplicacionAPP, txt_Buscar_APP, tbl_APP);
        APP.Encontrar_ListaAPP("tipo_pruebas", "tipo_prueba", jComboBox_PruebaAPP);
        APP.Encontrar_ListaAPP("aplicacion", "dpi_persona", jComboBox_AplicacionAPP);
        APP.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_Mantenimiento_APPMouseClicked

    private void jLabel_Mantenimiento_APPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_APPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Mantenimiento_APPMouseExited

    private void Panel_APPIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APPIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APPIMECMouseDragged

    private void Panel_APPIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APPIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APPIMECMouseMoved

    private void Panel_APPIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APPIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APPIMECMouseClicked

    private void Panel_APPIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APPIMECMouseExited
        // TODO add your handling code here:
        Panel_APPIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_APPIMECMouseExited

    private void Panel_APPIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_APPIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_APPIMECMouseReleased

    private void jLabel_SeleccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SeleccionMouseMoved
        // TODO add your handling code here:
        Panel_SIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_SeleccionMouseMoved

    private void jLabel_Modificar_SeleccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_SeleccionMouseMoved
        // TODO add your handling code here:
        Panel_SIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Modificar_SeleccionMouseMoved

    private void jLabel_Modificar_SeleccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_SeleccionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_SeleccionMouseExited

    private void jLabel_Eliminar_SeleccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_SeleccionMouseMoved
        // TODO add your handling code here:
        Panel_SIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Eliminar_SeleccionMouseMoved

    private void jLabel_Eliminar_SeleccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_SeleccionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Eliminar_SeleccionMouseExited

    private void jLabel_Consultar_SeleccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Consultar_SeleccionMouseMoved
        // TODO add your handling code here:
        Panel_SIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Consultar_SeleccionMouseMoved

    private void jLabel_Consultar_SeleccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Consultar_SeleccionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Consultar_SeleccionMouseExited

    private void jLabel_Mantenimiento_SeleccionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_SeleccionMouseMoved
        // TODO add your handling code here:
        Panel_SIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Mantenimiento_SeleccionMouseMoved

    private void jLabel_Mantenimiento_SeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_SeleccionMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoS.setVisible(true);
        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.Encontrar_ListaSeleccion("aplicacion_prueba", "id_ap", jComboBox_APPS);
        S.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_Mantenimiento_SeleccionMouseClicked

    private void jLabel_Mantenimiento_SeleccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_SeleccionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Mantenimiento_SeleccionMouseExited

    private void Panel_SIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SIMECMouseDragged

    private void Panel_SIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SIMECMouseMoved

    private void Panel_SIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SIMECMouseClicked

    private void Panel_SIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SIMECMouseExited
        // TODO add your handling code here:
        Panel_SIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_SIMECMouseExited

    private void Panel_SIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_SIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_SIMECMouseReleased

    private void jLabel_SeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SeleccionMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel_SeleccionMouseClicked

    private void txt_idSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idSActionPerformed

    private void jComboBox_APPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_APPSActionPerformed

        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.EncontrarID_Seleccion("id_ap", "aplicacion_prueba", "id_ap", jComboBox_APPS, jLabel_RL_APPS);

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_APPSActionPerformed

    private void txt_EstatusSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EstatusSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EstatusSActionPerformed

    private void jLabel_InsertarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_InsertarSMouseClicked

        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.Insertar_Seleccion();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_InsertarSMouseClicked

    private void jLabel_ModificarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarSMouseClicked
        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.Modificar_Seleccion();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarSMouseClicked

    private void jLabel_EliminarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarSMouseClicked
        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.Eliminar_Seleccion();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarSMouseClicked

    private void jLabel_BuscarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarSMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarSMouseClicked

    private void txt_BuscarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarSActionPerformed

    private void txt_BuscarSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarSKeyReleased

        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.Buscar_Sele(txt_BuscarS.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarSKeyReleased

    private void tbl_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SMouseClicked

        int Seleccion = tbl_S.rowAtPoint(evt.getPoint());
        txt_idS.setText(String.valueOf(tbl_S.getValueAt(Seleccion, 0)));
        jLabel_RL_APPS.setText(String.valueOf(tbl_S.getValueAt(Seleccion, 1)));
        txt_EstatusS.setText(String.valueOf(tbl_S.getValueAt(Seleccion, 2)));
        Seleccion S = new Seleccion(txt_idS, jLabel_RL_APPS, txt_EstatusS, txt_BuscarS, tbl_S);
        S.BuscarFila_Seleccion("id_ap", " aplicacion_prueba", " id_ap", jComboBox_APPS, jLabel_RL_APPS);

        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_SMouseClicked

    private void jLabel_ActividadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ActividadMouseMoved
        // TODO add your handling code here:
        Panel_AIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ActividadMouseMoved

    private void jLabel_ActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ActividadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ActividadMouseClicked

    private void jLabel_Modificar_AMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_AMouseMoved
        // TODO add your handling code here:
        Panel_AIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Modificar_AMouseMoved

    private void jLabel_Modificar_AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_AMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_AMouseExited

    private void jLabel_Eliminar_AMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_AMouseMoved
        // TODO add your handling code here:
        Panel_AIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Eliminar_AMouseMoved

    private void jLabel_Eliminar_AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_AMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Eliminar_AMouseExited

    private void jLabel_Consultar_AMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Consultar_AMouseMoved
        // TODO add your handling code here:
        Panel_AIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Consultar_AMouseMoved

    private void jLabel_Consultar_AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Consultar_AMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Consultar_AMouseExited

    private void jLabel_Mantenimiento_AMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_AMouseMoved
        // TODO add your handling code here:
        Panel_AIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_Mantenimiento_AMouseMoved

    private void jLabel_Mantenimiento_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_AMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoA.setVisible(true);

        Actividad AC = new Actividad(txt_id_A, txt_TA, jTextArea_DescripcionA, txt_BuscarA, tbl_A);
        AC.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_Mantenimiento_AMouseClicked

    private void jLabel_Mantenimiento_AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Mantenimiento_AMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Mantenimiento_AMouseExited

    private void Panel_AIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AIMECMouseDragged

    private void Panel_AIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AIMECMouseMoved

    private void Panel_AIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AIMECMouseClicked

    private void Panel_AIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AIMECMouseExited
        // TODO add your handling code here:
        Panel_AIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_AIMECMouseExited

    private void Panel_AIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AIMECMouseReleased

    private void txt_id_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_AActionPerformed

    private void txt_TAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TAActionPerformed

    private void jLabel_Insertar_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_AMouseClicked
        // TODO add your handling code here:
        Actividad AC = new Actividad(txt_id_A, txt_TA, jTextArea_DescripcionA, txt_BuscarA, tbl_A);
        AC.Insertar_AC();
    }//GEN-LAST:event_jLabel_Insertar_AMouseClicked

    private void jLabel_Modificar_AcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_AcMouseClicked
        // TODO add your handling code here:
        Actividad AC = new Actividad(txt_id_A, txt_TA, jTextArea_DescripcionA, txt_BuscarA, tbl_A);
        AC.Modificar_AC();
    }//GEN-LAST:event_jLabel_Modificar_AcMouseClicked

    private void jLabel_Eliminar_AcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_AcMouseClicked
        // TODO add your handling code here:
        Actividad AC = new Actividad(txt_id_A, txt_TA, jTextArea_DescripcionA, txt_BuscarA, tbl_A);
        AC.Eliminar_AC();
    }//GEN-LAST:event_jLabel_Eliminar_AcMouseClicked

    private void jLabel_BuscarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarAMouseClicked

    private void txt_BuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarAActionPerformed

    private void txt_BuscarAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarAKeyReleased
        // TODO add your handling code here:
        Actividad AC = new Actividad(txt_id_A, txt_TA, jTextArea_DescripcionA, txt_BuscarA, tbl_A);
        AC.Buscar_ACF(txt_BuscarA.getText());
    }//GEN-LAST:event_txt_BuscarAKeyReleased

    private void tbl_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_AMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_A.rowAtPoint(evt.getPoint());
        txt_id_A.setText(String.valueOf(tbl_A.getValueAt(Seleccion, 0)));
        txt_TA.setText(String.valueOf(tbl_A.getValueAt(Seleccion, 1)));
        jTextArea_DescripcionA.setText(String.valueOf(tbl_A.getValueAt(Seleccion, 2)));
    }//GEN-LAST:event_tbl_AMouseClicked

    private void jLabel_PeriodoPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PeriodoPMouseMoved
        // TODO add your handling code here:
        Panel_PPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_PeriodoPMouseMoved

    private void jLabel_PeriodoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PeriodoPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_PeriodoPMouseClicked

    private void jLabel_ModificarPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarPPMouseMoved
        // TODO add your handling code here:
        Panel_PPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarPPMouseMoved

    private void jLabel_ModificarPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarPPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarPPMouseExited

    private void jLabel_EliminarPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarPPMouseMoved
        // TODO add your handling code here:
        Panel_PPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarPPMouseMoved

    private void jLabel_EliminarPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarPPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarPPMouseExited

    private void jLabel_ConsultarPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarPPMouseMoved
        // TODO add your handling code here:
        Panel_PPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarPPMouseMoved

    private void jLabel_ConsultarPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarPPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarPPMouseExited

    private void jLabel_MantenimientoPPMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPPMouseMoved
        // TODO add your handling code here:
        Panel_PPIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoPPMouseMoved

    private void jLabel_MantenimientoPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPPMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoPP.setVisible(true);

        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.Encontrar_ListaPP("seleccion", "id_seleccion", jComboBox_PPS);
        periodo_p.Encontrar_ListaPP("actividad", "tipo_actividad", jComboBox_PPA);
        periodo_p.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoPPMouseClicked

    private void jLabel_MantenimientoPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoPPMouseExited

    private void Panel_PPIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PPIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_PPIMECMouseDragged

    private void Panel_PPIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PPIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_PPIMECMouseMoved

    private void Panel_PPIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PPIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_PPIMECMouseClicked

    private void Panel_PPIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PPIMECMouseExited
        // TODO add your handling code here:
        Panel_PPIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_PPIMECMouseExited

    private void Panel_PPIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_PPIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_PPIMECMouseReleased

    private void txt_id_PPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_PPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_PPActionPerformed

    private void jComboBox_PPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PPSActionPerformed
        // TODO add your handling code here:
        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.EncontrarID_PP("id_seleccion", "seleccion", "id_seleccion", jComboBox_PPS, jLabel_PPSE);
        
    }//GEN-LAST:event_jComboBox_PPSActionPerformed

    private void txt_id_FIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_FIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_FIActionPerformed

    private void txt_id_FFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_FFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_FFActionPerformed

    private void txt_id_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_PagoActionPerformed

    private void jComboBox_PPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PPAActionPerformed
        // TODO add your handling code here:
        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.EncontrarID_PP("id_actividad", "actividad", "tipo_actividad", jComboBox_PPA, jLabel_PPAA);
    }//GEN-LAST:event_jComboBox_PPAActionPerformed

    private void jLabel_IngresarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarPPMouseClicked
        // TODO add your handling code here:
        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.Insertar_PP();
    }//GEN-LAST:event_jLabel_IngresarPPMouseClicked

    private void jLabel_Modificar_PPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_PPMouseClicked
        // TODO add your handling code here:
        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.Modificar_PP();
    }//GEN-LAST:event_jLabel_Modificar_PPMouseClicked

    private void jLabel_Eliminar_PPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_PPMouseClicked
        // TODO add your handling code here:
        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.Eliminar_PP();
    }//GEN-LAST:event_jLabel_Eliminar_PPMouseClicked

    private void jLabel_BuscarPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarPPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarPPMouseClicked

    private void txt_BuscarPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarPPActionPerformed

    private void txt_BuscarPPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarPPKeyReleased
        // TODO add your handling code here:

        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.Buscar_PPE(txt_BuscarPP.getText());
    }//GEN-LAST:event_txt_BuscarPPKeyReleased

    private void tbl_PPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PPMouseClicked
        // TODO add your handling code here:

        int Seleccion = tbl_PP.rowAtPoint(evt.getPoint());

        txt_id_PP.setText(String.valueOf(tbl_PP.getValueAt(Seleccion, 0)));
        jLabel_PPSE.setText(String.valueOf(tbl_PP.getValueAt(Seleccion, 1)));
        txt_id_FI.setText(String.valueOf(tbl_PP.getValueAt(Seleccion, 2)));
        txt_id_FF.setText(String.valueOf(tbl_PP.getValueAt(Seleccion, 3)));
        txt_id_Pago.setText(String.valueOf(tbl_PP.getValueAt(Seleccion, 4)));
        jLabel_PPAA.setText(String.valueOf(tbl_PP.getValueAt(Seleccion, 5)));

        Periodo_Prueba periodo_p = new Periodo_Prueba(txt_id_PP, jLabel_PPSE, txt_id_FI, txt_id_FF, txt_id_Pago, jLabel_PPAA, txt_BuscarPP, tbl_PP);
        periodo_p.BuscarFila_PP("tipo_actividad", "actividad", "id_actividad", jComboBox_PPA, jLabel_PPAA);
        periodo_p.BuscarFila_PP("id_ap", "seleccion", "id_seleccion", jComboBox_PPS, jLabel_PPSE);

    }//GEN-LAST:event_tbl_PPMouseClicked

    private void jLabel_ContratacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ContratacionMouseMoved
        // TODO add your handling code here:
        Panel_CTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ContratacionMouseMoved

    private void jLabel_ContratacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ContratacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ContratacionMouseClicked

    private void jLabel_ModificarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarCMouseMoved
        // TODO add your handling code here:
        Panel_CTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarCMouseMoved

    private void jLabel_ModificarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarCMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarCMouseExited

    private void jLabel_EliminarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarCMouseMoved
        // TODO add your handling code here:
        Panel_CTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarCMouseMoved

    private void jLabel_EliminarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarCMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarCMouseExited

    private void jLabel_ConsultarCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarCMouseMoved
        // TODO add your handling code here:
        Panel_CTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarCMouseMoved

    private void jLabel_ConsultarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarCMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarCMouseExited

    private void jLabel_MantenimientoCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoCMouseMoved
        // TODO add your handling code here:
        Panel_CTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoCMouseMoved

    private void jLabel_MantenimientoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoCMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);

        jPanel_MantenimientoC.setVisible(true);
        Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
        C.Encontrar_ListaCon("periodo_prueba", "id_periodop", jComboBox_PPC);
        C.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoCMouseClicked

    private void jLabel_MantenimientoCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoCMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoCMouseExited

    private void Panel_CTIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CTIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CTIMECMouseDragged

    private void Panel_CTIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CTIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CTIMECMouseMoved

    private void Panel_CTIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CTIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CTIMECMouseClicked

    private void Panel_CTIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CTIMECMouseExited
        // TODO add your handling code here:
        Panel_CTIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_CTIMECMouseExited

    private void Panel_CTIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CTIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_CTIMECMouseReleased

    private void txt_id_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_CActionPerformed

    private void jComboBox_PPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PPCActionPerformed
        Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
        C.EncontrarID_Contratacion("id_periodop", "periodo_prueba", "id_periodop", jComboBox_PPC, jLabel_PPCC);
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_PPCActionPerformed

    private void txt_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FCActionPerformed

    private void txt_DCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DCActionPerformed

    private void txt_ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ECActionPerformed

    private void jLabel_InsertarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_InsertarCMouseClicked
        Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
        C.Insertar_Contratacion();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_InsertarCMouseClicked

    private void jLabel_Modificar_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_CMouseClicked
        Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
        C.Modificar_Contratacion();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Modificar_CMouseClicked

    private void jLabel_Eliminar_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_CMouseClicked
        Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
        C.Eliminar_Contratacion();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Eliminar_CMouseClicked

    private void txt_Buscar_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_CActionPerformed

    private void txt_Buscar_CKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_CKeyReleased
Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
 C.Buscar_SolicitudCon(txt_Buscar_C.getText());        
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_CKeyReleased

    private void tbl_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CMouseClicked
        int Seleccion = tbl_C.rowAtPoint(evt.getPoint());
        txt_id_C.setText(String.valueOf(tbl_C.getValueAt(Seleccion, 0)));
        jLabel_PPCC.setText(String.valueOf(tbl_C.getValueAt(Seleccion, 1)));
        txt_FC.setText(String.valueOf(tbl_C.getValueAt(Seleccion, 2)));
        txt_DC.setText(String.valueOf(tbl_C.getValueAt(Seleccion, 3)));
        txt_EC.setText(String.valueOf(tbl_C.getValueAt(Seleccion, 4)));
        Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
        C.BuscarFila_Contratacion("id_periodop", "periodo_prueba", "id_periodop", jComboBox_PPC, jLabel_PPCC);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_CMouseClicked

    private void jComboBox_PPCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_PPCKeyReleased
       
       Contratacion C = new Contratacion(txt_id_C, jLabel_PPCC, txt_FC, txt_DC, txt_EC, txt_Buscar_C, tbl_C);
       C.Buscar_Contratacion(txt_Buscar_C.getText()); 

// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_PPCKeyReleased

    private void jLabel_EmpleadoCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmpleadoCMouseMoved
        // TODO add your handling code here:
        Panel_ECTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EmpleadoCMouseMoved

    private void jLabel_EmpleadoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmpleadoCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmpleadoCMouseClicked

    private void jLabel_ModificarECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarECMouseMoved
        // TODO add your handling code here:
        Panel_ECTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarECMouseMoved

    private void jLabel_ModificarECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarECMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarECMouseExited

    private void jLabel_EliminarECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarECMouseMoved
        // TODO add your handling code here:
        Panel_ECTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarECMouseMoved

    private void jLabel_EliminarECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarECMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarECMouseExited

    private void jLabel_ConsultarECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarECMouseMoved
        // TODO add your handling code here:
        Panel_ECTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarECMouseMoved

    private void jLabel_ConsultarECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarECMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarECMouseExited

    private void jLabel_MantenimientoECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoECMouseMoved
        // TODO add your handling code here:
        Panel_ECTIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoECMouseMoved

    private void jLabel_MantenimientoECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoECMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);
        
        jPanel_MantenimientoEC.setVisible(true);
        
        
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Encontrar_ListaEC("contratacion", "id_contratacion", jComboBox_CEC);
        empleado.Encontrar_ListaEC("puesto", "nombre_puesto", jComboBox_ECP);
        empleado.Encontrar_ListaEC("departamento", "nombre_departamento", jComboBox_ECD);
        empleado.Actualizar_Tabla();
    }//GEN-LAST:event_jLabel_MantenimientoECMouseClicked

    private void jLabel_MantenimientoECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoECMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoECMouseExited

    private void Panel_ECTIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ECTIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ECTIMECMouseDragged

    private void Panel_ECTIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ECTIMECMouseMoved
        // TODO add your handling code here:
        Panel_ECTIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_ECTIMECMouseMoved

    private void Panel_ECTIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ECTIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ECTIMECMouseClicked

    private void Panel_ECTIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ECTIMECMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ECTIMECMouseExited

    private void Panel_ECTIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ECTIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_ECTIMECMouseReleased

    private void jLabel_MantenimientoPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoPMouseEntered

    private void txt_id_ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_ECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_ECActionPerformed

    private void jComboBox_CECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CECActionPerformed
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.EncontrarID_CE("id_contratacion", "contratacion", "id_contratacion", jComboBox_CEC, jLabel_CECC);
        //60,63,65
    }//GEN-LAST:event_jComboBox_CECActionPerformed

    private void jComboBox_ECPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ECPActionPerformed
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.EncontrarID_CE("id_puesto", "puesto", "nombre_puesto", jComboBox_ECP, jLabel_ECPP);
        
    }//GEN-LAST:event_jComboBox_ECPActionPerformed

    private void jComboBox_ECDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ECDActionPerformed
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.EncontrarID_CE("id_departamento", "departamento", "nombre_departamento", jComboBox_ECD, jLabel_ECDD);
        
    }//GEN-LAST:event_jComboBox_ECDActionPerformed

    private void txt_SECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SECActionPerformed

    private void jLabel_IngresarECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IngresarECMouseClicked
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Insertar_PP();
        
        Bitacora_Empleado BE= new Bitacora_Empleado(jTextField_Encontraid,txt_Buscar_BE,tbl_BE);
        BE.Insertar_BE();
    }//GEN-LAST:event_jLabel_IngresarECMouseClicked

    private void jLabel_Modificar_ECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_ECMouseClicked
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Modificar_EC();
    }//GEN-LAST:event_jLabel_Modificar_ECMouseClicked

    private void jLabel_Eliminar_ECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_ECMouseClicked
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Eliminar_EC();
    }//GEN-LAST:event_jLabel_Eliminar_ECMouseClicked

    private void txt_BuscarECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarECActionPerformed

    private void txt_BuscarECKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarECKeyReleased
        // TODO add your handling code here:
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.Buscar_ECE(txt_BuscarEC.getText());
    }//GEN-LAST:event_txt_BuscarECKeyReleased

    private void tbl_ECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ECMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_EC.rowAtPoint(evt.getPoint());
        
        txt_id_EC.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 0)));
        jLabel_CECC.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 1)));
        jLabel_ECPP.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 2)));
        jLabel_ECDD.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 3)));
        txt_SEC.setText(String.valueOf(tbl_EC.getValueAt(Seleccion, 4)));
        
        Empleado_Contratado empleado = new Empleado_Contratado (txt_id_EC, jLabel_CECC, jLabel_ECPP, jLabel_ECDD, txt_SEC, txt_BuscarEC, tbl_EC);
        empleado.BuscarFila_EC("id_contratacion", "contratacion", "id_contratacion", jComboBox_CEC, jLabel_CECC);
        empleado.BuscarFila_EC("nombre_puesto", "puesto", "id_puesto", jComboBox_ECP, jLabel_ECPP);
        empleado.BuscarFila_EC("nombre_departamento", "departamento", "id_departamento", jComboBox_ECD, jLabel_ECDD);
    }//GEN-LAST:event_tbl_ECMouseClicked

    private void txt_BuscarECKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarECKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarECKeyPressed

    private void jLabel_AEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AEMouseMoved
        // TODO add your handling code here:
        Panel_AEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_AEMouseMoved

    private void jLabel_AEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_AEMouseClicked

    private void jLabel_ModificarAEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAEMouseMoved
        // TODO add your handling code here:
        Panel_AEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ModificarAEMouseMoved

    private void jLabel_ModificarAEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ModificarAEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ModificarAEMouseExited

    private void jLabel_EliminarAEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAEMouseMoved
        // TODO add your handling code here:
        Panel_AEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_EliminarAEMouseMoved

    private void jLabel_EliminarAEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EliminarAEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EliminarAEMouseExited

    private void jLabel_ConsultarAEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAEMouseMoved
        // TODO add your handling code here:
        Panel_AEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarAEMouseMoved

    private void jLabel_ConsultarAEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarAEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarAEMouseExited

    private void jLabel_MantenimientoAEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAEMouseMoved
        // TODO add your handling code here:
        Panel_AEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_MantenimientoAEMouseMoved

    private void jLabel_MantenimientoAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAEMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);
        
        
        jPanel_MantenimientoAE.setVisible(true);
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.Actualizar_Tabla();
        AE.Encontrar_ListaAE("empleado_contratado","id_empleado",jComboBox_AE_EC);
        AE.Encontrar_ListaAE("actividad","tipo_actividad",jComboBox_Actividad_AE);
    }//GEN-LAST:event_jLabel_MantenimientoAEMouseClicked

    private void jLabel_MantenimientoAEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MantenimientoAEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MantenimientoAEMouseExited

    private void Panel_AEIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AEIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AEIMECMouseDragged

    private void Panel_AEIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AEIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AEIMECMouseMoved

    private void Panel_AEIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AEIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AEIMECMouseClicked

    private void Panel_AEIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AEIMECMouseExited
        // TODO add your handling code here:
        Panel_AEIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_AEIMECMouseExited

    private void Panel_AEIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AEIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_AEIMECMouseReleased

    private void jComboBox_AE_ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AE_ECActionPerformed
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.EncontrarID_AE("id_empleado","empleado_contratado","id_empleado",jComboBox_AE_EC,jLabel_AE_ECC);
        
    }//GEN-LAST:event_jComboBox_AE_ECActionPerformed

    private void jComboBox_Actividad_AEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Actividad_AEActionPerformed
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.EncontrarID_AE("id_actividad","actividad","tipo_actividad",jComboBox_Actividad_AE,jLabel_Actividad_AEE);
    }//GEN-LAST:event_jComboBox_Actividad_AEActionPerformed

    private void jLabel_Insertar_AEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_AEMouseClicked
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.Insertar_AE();
    }//GEN-LAST:event_jLabel_Insertar_AEMouseClicked

    private void jLabel_Modificar_AEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_AEMouseClicked
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.Modificar_AE();
    }//GEN-LAST:event_jLabel_Modificar_AEMouseClicked

    private void jLabel_Eliminar_AEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_AEMouseClicked
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.Eliminar_AE();
    }//GEN-LAST:event_jLabel_Eliminar_AEMouseClicked

    private void jLabel_BuscarAEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarAEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BuscarAEMouseClicked

    private void txt_BuscarAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarAEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarAEActionPerformed

    private void txt_BuscarAEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarAEKeyReleased
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.Buscar_AEF(txt_BuscarAE.getText());
        
    }//GEN-LAST:event_txt_BuscarAEKeyReleased

    private void tbl_AEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_AEMouseClicked
        // TODO add your handling code here:
        Actividad_Empleado AE = new Actividad_Empleado(jLabel_AE_ECC,jLabel_Actividad_AEE,txt_BuscarAE,tbl_AE);
        AE.BuscarFila_AE("id_empleado","empleado_contratado","id_empleado",jComboBox_AE_EC,jLabel_AE_ECC);
        AE.BuscarFila_AE("tipo_actividad","actividad","id_actividad",jComboBox_Actividad_AE,jLabel_Actividad_AEE);
    }//GEN-LAST:event_tbl_AEMouseClicked

    private void jLabel_BEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BEMouseMoved
        // TODO add your handling code here:
        Panel_BEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_BEMouseMoved

    private void jLabel_BEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BEMouseClicked

    private void jLabel_ConsultarBEMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarBEMouseMoved
        // TODO add your handling code here:
        Panel_BEIMEC.setVisible(true);
    }//GEN-LAST:event_jLabel_ConsultarBEMouseMoved

    private void jLabel_ConsultarBEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarBEMouseClicked
        // TODO add your handling code here:
        jLabel_RRHH.setVisible(false);
        jLabel_Departamento.setVisible(false);
        jLabel_ExpLD.setVisible(false);
        jLabel_ExpL.setVisible(false);
        jLabel_Medio.setVisible(false);
        jPanel_MantenimientosP.setVisible(false);
        jPanel_MantenimientoNA.setVisible(false);
        jPanel_MantenimientoExpLD.setVisible(false);
        jLabel_Puesto.setVisible(false);
        jLabel_SolicitudE.setVisible(false);
        jLabel_NivelA.setVisible(false);
        Panel_DIMEC.setVisible(false);
        Panel_PIMEC.setVisible(false);
        Panel_NAIMEC.setVisible(false);
        Panel_ExpLDIMEC.setVisible(false);
        Panel_ExpLIMEC.setVisible(false);
        Panel_SEIMEC.setVisible(false);
        Panel_MIMEC.setVisible(false);
        jLabel_RL.setVisible(false);
        Panel_RLIMEC.setVisible(false);
        jLabel_ReferenciasP.setVisible(false);
        Panel_RPIMEC.setVisible(false);
        jLabel_CV.setVisible(false);
        Panel_CVIMEC.setVisible(false);
        Panel_APIMEC.setVisible(false);
        jLabel_AP.setVisible(false);
        jLabel_TipoP.setVisible(false);
        Panel_TPIMEC.setVisible(false);
        jLabel_APP.setVisible(false);
        Panel_APPIMEC.setVisible(false);
        jLabel_Seleccion.setVisible(false);
        Panel_SIMEC.setVisible(false);
        jLabel_Actividad.setVisible(false);
        Panel_AIMEC.setVisible(false);
        jLabel_PeriodoP.setVisible(false);
        Panel_PPIMEC.setVisible(false);
        jLabel_Contratacion.setVisible(false);
        Panel_CTIMEC.setVisible(false);
        jLabel_EmpleadoC.setVisible(false);
        Panel_ECTIMEC.setVisible(false);
        jLabel_AE.setVisible(false);
        Panel_AEIMEC.setVisible(false);
        jLabel_BE.setVisible(false);
        Panel_BEIMEC.setVisible(false);
        
        jPanel_MantenimientoBE.setVisible(true);
        
        Bitacora_Empleado BE= new Bitacora_Empleado(jTextField_Encontraid,txt_Buscar_BE,tbl_BE);
        //BE.Actualizar_Tabla();
        String[] Bi_datos = new String [9];
        try
        {           
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Bitacora");
            model.addColumn("ID Empleado Contratado");
            model.addColumn("ID Contatacion");
            model.addColumn("Puesto");
            model.addColumn("Departamento");
            model.addColumn("Sueldo");
            
            
            Connection cn = DriverManager.getConnection(Base_de_Datos,Usuario,Clave);
            PreparedStatement pst = cn.prepareStatement("select id_empleado, id_contratacion, id_puesto, id_departamento, sueldo_empleado from empleado_contratado ");  
            PreparedStatement pst2 = cn.prepareStatement("select id_bitacora from bitacora_empleado");
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            while(rs.next() && rs2.next())
            {
                Bi_datos[0] = rs2.getString("id_bitacora");
                Bi_datos[1] = rs.getString("id_empleado");
                Bi_datos[2] = rs.getString("id_contratacion");
                Bi_datos[3] = rs.getString("id_puesto");
                Bi_datos[4] = rs.getString("id_departamento");
                Bi_datos[5] = rs.getString("sueldo_empleado");
                model.addRow(Bi_datos);
            }
            tbl_BE.setModel(model);
               
        }catch(Exception e)
        {
            System.out.println(e);
        }        
    }//GEN-LAST:event_jLabel_ConsultarBEMouseClicked

    private void jLabel_ConsultarBEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ConsultarBEMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ConsultarBEMouseExited

    private void Panel_BEIMECMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BEIMECMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_BEIMECMouseDragged

    private void Panel_BEIMECMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BEIMECMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_BEIMECMouseMoved

    private void Panel_BEIMECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BEIMECMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_BEIMECMouseClicked

    private void Panel_BEIMECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BEIMECMouseExited
        // TODO add your handling code here:
        Panel_BEIMEC.setVisible(false);
    }//GEN-LAST:event_Panel_BEIMECMouseExited

    private void Panel_BEIMECMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BEIMECMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_BEIMECMouseReleased

    private void txt_Buscar_BEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_BEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_BEActionPerformed

    private void txt_Buscar_BEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_BEKeyReleased
        // TODO add your handling code here:
        String[] Bi_datos = new String [9];
        try
        {           
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Bitacora");
            model.addColumn("ID Empleado Contratado");
            model.addColumn("ID Contatacion");
            model.addColumn("Puesto");
            model.addColumn("Departamento");
            model.addColumn("Sueldo");
            
            
            Connection cn = DriverManager.getConnection(Base_de_Datos,Usuario,Clave);
            PreparedStatement pst = cn.prepareStatement("select id_empleado, id_contratacion, id_puesto, id_departamento, sueldo_empleado from empleado_contratado ");  
            PreparedStatement pst2 = cn.prepareStatement("select id_bitacora from bitacora_empleado");
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            while(rs.next() && rs2.next())
            {
                Bi_datos[0] = rs2.getString("id_bitacora");
                Bi_datos[1] = rs.getString("id_empleado");
                Bi_datos[2] = rs.getString("id_contratacion");
                Bi_datos[3] = rs.getString("id_puesto");
                Bi_datos[4] = rs.getString("id_departamento");
                Bi_datos[5] = rs.getString("sueldo_empleado");
                model.addRow(Bi_datos);
            }
            tbl_BE.setModel(model);
               
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_txt_Buscar_BEKeyReleased

    private void tbl_BEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_BEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_BEMouseClicked

    private void txt_BuscarAEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarAEKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarAEKeyPressed

    private void jTextField_EncontraidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EncontraidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EncontraidActionPerformed

    private void jLabel_Buscar_BEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Buscar_BEMouseClicked
        // TODO add your handling code here:        
        String[] B_datos = new String [12];
        String Idbus;
        String contrata;
        Idbus = txt_Buscar_BE.getText();
        try
        {           
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Bitacora");//0
            model.addColumn("ID Empleado Contratado");//1
            model.addColumn("ID Contatacion");//2
            model.addColumn("Fecha contratacion");//3
            model.addColumn("ID Puesto");//4
            model.addColumn("Nombre Puesto");//5
            model.addColumn("ID Departamento");//6
            model.addColumn("Nombre Departamento");//7
            model.addColumn("Sueldo");//8
            model.addColumn("Dpi persona");//9
            model.addColumn("Nombre Persona");//10
            model.addColumn("Apellido Persona");//11
            
            
            
            
            
            Connection cn = DriverManager.getConnection(Base_de_Datos,Usuario,Clave);
            PreparedStatement pst = cn.prepareStatement("select id_empleado, id_contratacion, id_puesto, id_departamento, sueldo_empleado from empleado_contratado where id_empleado =" + Idbus );  
            PreparedStatement pst2 = cn.prepareStatement("select id_bitacora from bitacora_empleado where id_empleado_B =" + Idbus);
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            while(rs.next() && rs2.next())
            {
                txt_contra.setText(rs.getString("id_contratacion")); 
                txt_puesto.setText(rs.getString("id_puesto"));
                txt_depa.setText(rs.getString("id_departamento"));
                B_datos[0] = rs2.getString("id_bitacora");
                B_datos[1] = rs.getString("id_empleado");
                B_datos[2] = rs.getString("id_contratacion");
                B_datos[4] = rs.getString("id_puesto");
                B_datos[6] = rs.getString("id_departamento");
                B_datos[8] = rs.getString("sueldo_empleado");
                PreparedStatement pst3 = cn.prepareStatement("select fecha_contratacion from contratacion where id_contratacion = " + txt_contra.getText());
                ResultSet rs3 = pst3.executeQuery();
                while(rs3.next())
                {
                    B_datos[3] = rs3.getString("fecha_contratacion");
                    
                    PreparedStatement pst4 = cn.prepareStatement("select nombre_puesto from puesto where id_puesto = " + txt_puesto.getText());
                    ResultSet rs4 = pst4.executeQuery();
                    while(rs4.next())
                    {
                        B_datos[5] = rs4.getString("nombre_puesto");
                        
                        PreparedStatement pst5 = cn.prepareStatement("select nombre_departamento from departamento where id_departamento = " + txt_depa.getText());
                        ResultSet rs5 = pst5.executeQuery();
                        while(rs5.next())
                        {
                            B_datos[7] = rs5.getString("nombre_departamento");   
                            
                            PreparedStatement pst6 = cn.prepareStatement("select id_periodop from contratacion where id_contratacion = " + txt_contra.getText());
                            ResultSet rs6 = pst6.executeQuery();
                            while(rs6.next())
                            {
                                txt_peri.setText(rs6.getString("id_periodop"));
                                
                                
                                PreparedStatement pst7 = cn.prepareStatement("select id_seleccion from periodo_prueba where id_periodop = " + txt_peri.getText());
                                ResultSet rs7 = pst7.executeQuery();
                                while(rs7.next())
                                {
                                    txt_selec.setText(rs7.getString("id_seleccion"));
                                    
                                    
                                    PreparedStatement pst8 = cn.prepareStatement("select id_ap from seleccion where id_seleccion = " + txt_selec.getText());
                                    ResultSet rs8 = pst8.executeQuery();
                                    while(rs8.next())
                                    {
                                        txt_ap.setText(rs8.getString("id_ap"));
                                        
                                        PreparedStatement pst9 = cn.prepareStatement("select id_aplicacion from aplicacion_prueba where id_ap = " + txt_ap.getText());
                                        ResultSet rs9 = pst9.executeQuery();
                                        while(rs9.next())
                                        {
                                            txt_idap.setText(rs9.getString("id_aplicacion"));
                                            
                                            
                                            PreparedStatement pst10 = cn.prepareStatement("select * from aplicacion where id_aplicacion = " + txt_idap.getText());
                                            ResultSet pel = pst10.executeQuery();
                                            while(pel.next())
                                            {
                                                txt_dpi.setText(pel.getString("dpi_persona"));
                                                B_datos[9] = pel.getString("dpi_persona");
                                                //tbl_BE.setModel(model);
                                                
                                                PreparedStatement pst11 = cn.prepareStatement("select nombres_persona, apellidos_persona from curriculum where dpi_persona = " + txt_dpi.getText());
                                                ResultSet res = pst11.executeQuery();
                                                while(res.next())
                                                {
                                                //B_datos[9] = res.getString("dpi_persona");
                                                B_datos[10] = res.getString("nombres_persona");
                                                B_datos[11] = res.getString("apellidos_persona");
                                                model.addRow(B_datos);
                                                }

                                            }
                                        }
                                    }
                                }
                                
                            }
                        }
                    }
                    
                    
                }
            }
            tbl_BE.setModel(model);
               
        }catch(Exception e)
        {
            System.out.println(e);
        }        
    }//GEN-LAST:event_jLabel_Buscar_BEMouseClicked

    private void txt_Buscar_BEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_BEKeyTyped
        // TODO add your handling code here:
       /* String[] B_datos = new String [9];
        String Idbus;
        Idbus = txt_Buscar_BE.getText();
        try
        {           
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Bitacora");
            model.addColumn("ID Empleado Contratado");
            model.addColumn("ID Contatacion");
            model.addColumn("Puesto");
            model.addColumn("Departamento");
            model.addColumn("Sueldo");
            
            
            Connection cn = DriverManager.getConnection(Base_de_Datos,Usuario,Clave);
            PreparedStatement pst = cn.prepareStatement("select id_empleado, id_contratacion, id_puesto, id_departamento, sueldo_empleado from empleado_contratado where id_empleado =" + Idbus );  
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                txt_puesto.setText(rs.getString("id_puesto")); 
                B_datos[0] = (" ");
                B_datos[1] = rs.getString("id_empleado");
                B_datos[2] = rs.getString("id_contratacion");
                B_datos[3] = rs.getString("id_puesto");
                B_datos[4] = rs.getString("id_departamento");
                B_datos[5] = rs.getString("sueldo_empleado");
                model.addRow(B_datos);
            }
            PreparedStatement pst2 = cn.prepareStatement("select nombre_puesto from puesto where id_puesto = " + txt_puesto.getText() );  
            ResultSet rs2 = pst2.executeQuery();
            tbl_BE.setModel(model);
               
        }catch(Exception e)
        {
            System.out.println(e);
        }      */  
    }//GEN-LAST:event_txt_Buscar_BEKeyTyped

    private void txt_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_puestoActionPerformed

    private void txt_id_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_PuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_PuestoActionPerformed

    private void txt_Nombre_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_PuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_PuestoActionPerformed

    private void txt_Estatus_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Estatus_PuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Estatus_PuestoActionPerformed

    private void tbl_PuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PuestoMouseClicked
        // TODO add your handling code here:
        int Seleccion = tbl_Puesto.rowAtPoint(evt.getPoint());
        txt_id_Puesto.setText(String.valueOf(tbl_Puesto.getValueAt(Seleccion, 0)));
        txt_Nombre_Puesto.setText(String.valueOf(tbl_Puesto.getValueAt(Seleccion, 1)));
        txt_Descripcion_Puesto.setText(String.valueOf(tbl_Puesto.getValueAt(Seleccion, 2)));
        txt_Estatus_Puesto.setText(String.valueOf(tbl_Puesto.getValueAt(Seleccion, 3)));
    }//GEN-LAST:event_tbl_PuestoMouseClicked

    private void txt_Buscar_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_PuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_PuestoActionPerformed

    private void txt_Buscar_PuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_PuestoKeyReleased
        // TODO add your handling code here:
        Puesto puesto = new Puesto(txt_id_Puesto, txt_Nombre_Puesto, txt_Descripcion_Puesto, txt_Estatus_Puesto, txt_Buscar_Puesto, tbl_Puesto);
        puesto.Buscar_PuestoF(txt_Buscar_Puesto.getText());
    }//GEN-LAST:event_txt_Buscar_PuestoKeyReleased

    private void jLabel_Insertar_PuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Insertar_PuestoMouseClicked
        // TODO add your handling code here:
        Puesto puesto = new Puesto(txt_id_Puesto, txt_Nombre_Puesto, txt_Descripcion_Puesto, txt_Estatus_Puesto, txt_Buscar_Puesto, tbl_Puesto);
        puesto.Insertar_Puesto();
    }//GEN-LAST:event_jLabel_Insertar_PuestoMouseClicked

    private void jLabel_Modificar_PuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Modificar_PuestoMouseClicked
        // TODO add your handling code here:
        Puesto puesto = new Puesto(txt_id_Puesto, txt_Nombre_Puesto, txt_Descripcion_Puesto, txt_Estatus_Puesto, txt_Buscar_Puesto, tbl_Puesto);
        puesto.Modificar_Puesto();
    }//GEN-LAST:event_jLabel_Modificar_PuestoMouseClicked

    private void jLabel_Eliminar_PuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Eliminar_PuestoMouseClicked
        // TODO add your handling code here:
        Puesto puesto = new Puesto(txt_id_Puesto, txt_Nombre_Puesto, txt_Descripcion_Puesto, txt_Estatus_Puesto, txt_Buscar_Puesto, tbl_Puesto);
        puesto.Eliminar_Puesto();
    }//GEN-LAST:event_jLabel_Eliminar_PuestoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RRHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RRHH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_AEIMEC;
    private javax.swing.JPanel Panel_AIMEC;
    private javax.swing.JPanel Panel_APIMEC;
    private javax.swing.JPanel Panel_APPIMEC;
    private javax.swing.JPanel Panel_BEIMEC;
    private javax.swing.JPanel Panel_CTIMEC;
    private javax.swing.JPanel Panel_CVIMEC;
    private javax.swing.JPanel Panel_DIMEC;
    private javax.swing.JPanel Panel_ECTIMEC;
    private javax.swing.JPanel Panel_ExpLDIMEC;
    private javax.swing.JPanel Panel_ExpLIMEC;
    private javax.swing.JPanel Panel_MIMEC;
    private javax.swing.JPanel Panel_NAIMEC;
    private javax.swing.JPanel Panel_PIMEC;
    private javax.swing.JPanel Panel_PPIMEC;
    private javax.swing.JPanel Panel_RLIMEC;
    private javax.swing.JPanel Panel_RPIMEC;
    private javax.swing.JPanel Panel_SEIMEC;
    private javax.swing.JPanel Panel_SIMEC;
    private javax.swing.JPanel Panel_TPIMEC;
    private javax.swing.JComboBox<String> jComboBox_AE_EC;
    private javax.swing.JComboBox<String> jComboBox_APPS;
    private javax.swing.JComboBox<String> jComboBox_Actividad_AE;
    private javax.swing.JComboBox<String> jComboBox_AplicacionAPP;
    private javax.swing.JComboBox<String> jComboBox_CEC;
    private javax.swing.JComboBox<String> jComboBox_DPIAP;
    private javax.swing.JComboBox<String> jComboBox_DepartamentoSE;
    private javax.swing.JComboBox<String> jComboBox_ECD;
    private javax.swing.JComboBox<String> jComboBox_ECP;
    private javax.swing.JComboBox<String> jComboBox_ELCV;
    private javax.swing.JComboBox<String> jComboBox_ExperienciaL_SE;
    private javax.swing.JComboBox<String> jComboBox_IDSEM;
    private javax.swing.JComboBox<String> jComboBox_MedioCV;
    private javax.swing.JComboBox<String> jComboBox_NivelACV;
    private javax.swing.JComboBox<String> jComboBox_NivelASE;
    private javax.swing.JComboBox<String> jComboBox_Nombre_EpLLD;
    private javax.swing.JComboBox<String> jComboBox_PPA;
    private javax.swing.JComboBox<String> jComboBox_PPC;
    private javax.swing.JComboBox<String> jComboBox_PPS;
    private javax.swing.JComboBox<String> jComboBox_PruebaAPP;
    private javax.swing.JComboBox<String> jComboBox_PuestoSE;
    private javax.swing.JComboBox<String> jComboBox_RLCV;
    private javax.swing.JComboBox<String> jComboBox_RPCV;
    private javax.swing.JLabel jLabe_SEC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_AE;
    private javax.swing.JLabel jLabel_AE_EC;
    private javax.swing.JLabel jLabel_AE_ECC;
    private javax.swing.JLabel jLabel_AP;
    private javax.swing.JLabel jLabel_APP;
    private javax.swing.JLabel jLabel_APPS;
    private javax.swing.JLabel jLabel_Actividad;
    private javax.swing.JLabel jLabel_Actividad_AE;
    private javax.swing.JLabel jLabel_Actividad_AEE;
    private javax.swing.JLabel jLabel_ApellidoCV;
    private javax.swing.JLabel jLabel_AplicacionAPP;
    private javax.swing.JLabel jLabel_Aplicacion_APP;
    private javax.swing.JLabel jLabel_BE;
    private javax.swing.JLabel jLabel_Buscar;
    private javax.swing.JLabel jLabel_BuscarA;
    private javax.swing.JLabel jLabel_BuscarAE;
    private javax.swing.JLabel jLabel_BuscarAP;
    private javax.swing.JLabel jLabel_BuscarEC;
    private javax.swing.JLabel jLabel_BuscarM;
    private javax.swing.JLabel jLabel_BuscarPP;
    private javax.swing.JLabel jLabel_BuscarRL;
    private javax.swing.JLabel jLabel_BuscarS;
    private javax.swing.JLabel jLabel_BuscarTP;
    private javax.swing.JLabel jLabel_Buscar_APP;
    private javax.swing.JLabel jLabel_Buscar_BE;
    private javax.swing.JLabel jLabel_Buscar_C;
    private javax.swing.JLabel jLabel_Buscar_CV;
    private javax.swing.JLabel jLabel_Buscar_ExpL;
    private javax.swing.JLabel jLabel_Buscar_ExpLD;
    private javax.swing.JLabel jLabel_Buscar_NivelA;
    private javax.swing.JLabel jLabel_Buscar_Puesto;
    private javax.swing.JLabel jLabel_Buscar_RP;
    private javax.swing.JLabel jLabel_Buscar_SE;
    private javax.swing.JLabel jLabel_CEC;
    private javax.swing.JLabel jLabel_CECC;
    private javax.swing.JLabel jLabel_CV;
    private javax.swing.JLabel jLabel_ConsultarA;
    private javax.swing.JLabel jLabel_ConsultarAE;
    private javax.swing.JLabel jLabel_ConsultarAP;
    private javax.swing.JLabel jLabel_ConsultarAPP;
    private javax.swing.JLabel jLabel_ConsultarBE;
    private javax.swing.JLabel jLabel_ConsultarC;
    private javax.swing.JLabel jLabel_ConsultarCV;
    private javax.swing.JLabel jLabel_ConsultarD;
    private javax.swing.JLabel jLabel_ConsultarEC;
    private javax.swing.JLabel jLabel_ConsultarExpL;
    private javax.swing.JLabel jLabel_ConsultarExpLD;
    private javax.swing.JLabel jLabel_ConsultarM;
    private javax.swing.JLabel jLabel_ConsultarP;
    private javax.swing.JLabel jLabel_ConsultarPP;
    private javax.swing.JLabel jLabel_ConsultarRP;
    private javax.swing.JLabel jLabel_ConsultarSE;
    private javax.swing.JLabel jLabel_ConsultarTP;
    private javax.swing.JLabel jLabel_Consultar_A;
    private javax.swing.JLabel jLabel_Consultar_RL;
    private javax.swing.JLabel jLabel_Consultar_Seleccion;
    private javax.swing.JLabel jLabel_Contratacion;
    private javax.swing.JLabel jLabel_CorreoCV;
    private javax.swing.JLabel jLabel_Correo_CV;
    private javax.swing.JLabel jLabel_DC;
    private javax.swing.JLabel jLabel_DPIAP;
    private javax.swing.JLabel jLabel_DPIAP1;
    private javax.swing.JLabel jLabel_DPICV;
    private javax.swing.JLabel jLabel_DPI_AP;
    private javax.swing.JLabel jLabel_Departamento;
    private javax.swing.JLabel jLabel_DepartamentoSE;
    private javax.swing.JLabel jLabel_Departamento_SE;
    private javax.swing.JLabel jLabel_DescripcionA;
    private javax.swing.JLabel jLabel_DescripcionM;
    private javax.swing.JLabel jLabel_DescripcionSE;
    private javax.swing.JLabel jLabel_Descripcion_NivelA;
    private javax.swing.JLabel jLabel_Descripcion_Puesto;
    private javax.swing.JLabel jLabel_Descripcion_Puesto1;
    private javax.swing.JLabel jLabel_DireccionCV;
    private javax.swing.JLabel jLabel_EC;
    private javax.swing.JLabel jLabel_ECD;
    private javax.swing.JLabel jLabel_ECDD;
    private javax.swing.JLabel jLabel_ECP;
    private javax.swing.JLabel jLabel_ECPP;
    private javax.swing.JLabel jLabel_ELCV;
    private javax.swing.JLabel jLabel_EL_CV;
    private javax.swing.JLabel jLabel_EdadCV;
    private javax.swing.JLabel jLabel_Eliminar;
    private javax.swing.JLabel jLabel_EliminarA;
    private javax.swing.JLabel jLabel_EliminarAE;
    private javax.swing.JLabel jLabel_EliminarAP;
    private javax.swing.JLabel jLabel_EliminarAPP;
    private javax.swing.JLabel jLabel_EliminarC;
    private javax.swing.JLabel jLabel_EliminarCV;
    private javax.swing.JLabel jLabel_EliminarD;
    private javax.swing.JLabel jLabel_EliminarEC;
    private javax.swing.JLabel jLabel_EliminarExpL;
    private javax.swing.JLabel jLabel_EliminarExpLD;
    private javax.swing.JLabel jLabel_EliminarM;
    private javax.swing.JLabel jLabel_EliminarP;
    private javax.swing.JLabel jLabel_EliminarPP;
    private javax.swing.JLabel jLabel_EliminarRL;
    private javax.swing.JLabel jLabel_EliminarRP;
    private javax.swing.JLabel jLabel_EliminarS;
    private javax.swing.JLabel jLabel_EliminarSE;
    private javax.swing.JLabel jLabel_EliminarTP;
    private javax.swing.JLabel jLabel_Eliminar_A;
    private javax.swing.JLabel jLabel_Eliminar_AE;
    private javax.swing.JLabel jLabel_Eliminar_AP;
    private javax.swing.JLabel jLabel_Eliminar_APP;
    private javax.swing.JLabel jLabel_Eliminar_Ac;
    private javax.swing.JLabel jLabel_Eliminar_C;
    private javax.swing.JLabel jLabel_Eliminar_CV;
    private javax.swing.JLabel jLabel_Eliminar_EC;
    private javax.swing.JLabel jLabel_Eliminar_ExpL;
    private javax.swing.JLabel jLabel_Eliminar_ExpLD;
    private javax.swing.JLabel jLabel_Eliminar_M;
    private javax.swing.JLabel jLabel_Eliminar_NivelA;
    private javax.swing.JLabel jLabel_Eliminar_PP;
    private javax.swing.JLabel jLabel_Eliminar_Puesto;
    private javax.swing.JLabel jLabel_Eliminar_RL;
    private javax.swing.JLabel jLabel_Eliminar_RP;
    private javax.swing.JLabel jLabel_Eliminar_SE;
    private javax.swing.JLabel jLabel_Eliminar_Seleccion;
    private javax.swing.JLabel jLabel_Eliminar_TP;
    private javax.swing.JLabel jLabel_EmpleadoC;
    private javax.swing.JLabel jLabel_EstatusAPP;
    private javax.swing.JLabel jLabel_EstatusS;
    private javax.swing.JLabel jLabel_Estatus_Departamento;
    private javax.swing.JLabel jLabel_ExpL;
    private javax.swing.JLabel jLabel_ExpLD;
    private javax.swing.JLabel jLabel_ExperieciaLSE;
    private javax.swing.JLabel jLabel_ExperienciaL_SE;
    private javax.swing.JLabel jLabel_FC;
    private javax.swing.JLabel jLabel_FF;
    private javax.swing.JLabel jLabel_FI;
    private javax.swing.JLabel jLabel_GeneroCV;
    private javax.swing.JLabel jLabel_IDS;
    private javax.swing.JLabel jLabel_ID_A;
    private javax.swing.JLabel jLabel_ID_AP;
    private javax.swing.JLabel jLabel_ID_APP;
    private javax.swing.JLabel jLabel_ID_C;
    private javax.swing.JLabel jLabel_ID_Departamento;
    private javax.swing.JLabel jLabel_ID_EC;
    private javax.swing.JLabel jLabel_ID_ExpL;
    private javax.swing.JLabel jLabel_ID_ExpLD;
    private javax.swing.JLabel jLabel_ID_ExpLLD;
    private javax.swing.JLabel jLabel_ID_Medio;
    private javax.swing.JLabel jLabel_ID_NivelA;
    private javax.swing.JLabel jLabel_ID_PP;
    private javax.swing.JLabel jLabel_ID_Puesto;
    private javax.swing.JLabel jLabel_ID_RP;
    private javax.swing.JLabel jLabel_ID_ReferenciaL;
    private javax.swing.JLabel jLabel_ID_SEM;
    private javax.swing.JLabel jLabel_ID_SolicitudE1;
    private javax.swing.JLabel jLabel_Ingresar;
    private javax.swing.JLabel jLabel_IngresarAP;
    private javax.swing.JLabel jLabel_IngresarEC;
    private javax.swing.JLabel jLabel_IngresarM;
    private javax.swing.JLabel jLabel_IngresarPP;
    private javax.swing.JLabel jLabel_IngresarRL;
    private javax.swing.JLabel jLabel_IngresarSE;
    private javax.swing.JLabel jLabel_IngresarTP;
    private javax.swing.JLabel jLabel_Ingresar_APP;
    private javax.swing.JLabel jLabel_InsertarC;
    private javax.swing.JLabel jLabel_InsertarS;
    private javax.swing.JLabel jLabel_Insertar_A;
    private javax.swing.JLabel jLabel_Insertar_AE;
    private javax.swing.JLabel jLabel_Insertar_CV;
    private javax.swing.JLabel jLabel_Insertar_ExpL;
    private javax.swing.JLabel jLabel_Insertar_ExpLD;
    private javax.swing.JLabel jLabel_Insertar_NivelA;
    private javax.swing.JLabel jLabel_Insertar_Puesto;
    private javax.swing.JLabel jLabel_Insertar_RP;
    private javax.swing.JLabel jLabel_MantenimientoA;
    private javax.swing.JLabel jLabel_MantenimientoAE;
    private javax.swing.JLabel jLabel_MantenimientoAP;
    private javax.swing.JLabel jLabel_MantenimientoC;
    private javax.swing.JLabel jLabel_MantenimientoCV;
    private javax.swing.JLabel jLabel_MantenimientoD;
    private javax.swing.JLabel jLabel_MantenimientoEC;
    private javax.swing.JLabel jLabel_MantenimientoExpL;
    private javax.swing.JLabel jLabel_MantenimientoExpLD;
    private javax.swing.JLabel jLabel_MantenimientoM;
    private javax.swing.JLabel jLabel_MantenimientoP;
    private javax.swing.JLabel jLabel_MantenimientoPP;
    private javax.swing.JLabel jLabel_MantenimientoRP;
    private javax.swing.JLabel jLabel_MantenimientoSE;
    private javax.swing.JLabel jLabel_MantenimientoTP;
    private javax.swing.JLabel jLabel_Mantenimiento_A;
    private javax.swing.JLabel jLabel_Mantenimiento_APP;
    private javax.swing.JLabel jLabel_Mantenimiento_RL;
    private javax.swing.JLabel jLabel_Mantenimiento_Seleccion;
    private javax.swing.JLabel jLabel_Medio;
    private javax.swing.JLabel jLabel_MedioCV;
    private javax.swing.JLabel jLabel_Medio_CV;
    private javax.swing.JLabel jLabel_Modificar;
    private javax.swing.JLabel jLabel_ModificarA;
    private javax.swing.JLabel jLabel_ModificarAE;
    private javax.swing.JLabel jLabel_ModificarAP;
    private javax.swing.JLabel jLabel_ModificarAPP;
    private javax.swing.JLabel jLabel_ModificarC;
    private javax.swing.JLabel jLabel_ModificarCV;
    private javax.swing.JLabel jLabel_ModificarD;
    private javax.swing.JLabel jLabel_ModificarEC;
    private javax.swing.JLabel jLabel_ModificarExpL;
    private javax.swing.JLabel jLabel_ModificarExpLD;
    private javax.swing.JLabel jLabel_ModificarM;
    private javax.swing.JLabel jLabel_ModificarP;
    private javax.swing.JLabel jLabel_ModificarPP;
    private javax.swing.JLabel jLabel_ModificarRL;
    private javax.swing.JLabel jLabel_ModificarRP;
    private javax.swing.JLabel jLabel_ModificarS;
    private javax.swing.JLabel jLabel_ModificarSE;
    private javax.swing.JLabel jLabel_ModificarTP;
    private javax.swing.JLabel jLabel_Modificar_A;
    private javax.swing.JLabel jLabel_Modificar_AE;
    private javax.swing.JLabel jLabel_Modificar_AP;
    private javax.swing.JLabel jLabel_Modificar_APP;
    private javax.swing.JLabel jLabel_Modificar_Ac;
    private javax.swing.JLabel jLabel_Modificar_C;
    private javax.swing.JLabel jLabel_Modificar_CV;
    private javax.swing.JLabel jLabel_Modificar_EC;
    private javax.swing.JLabel jLabel_Modificar_ExpL;
    private javax.swing.JLabel jLabel_Modificar_ExpLD;
    private javax.swing.JLabel jLabel_Modificar_M;
    private javax.swing.JLabel jLabel_Modificar_NivelA;
    private javax.swing.JLabel jLabel_Modificar_PP;
    private javax.swing.JLabel jLabel_Modificar_Puesto;
    private javax.swing.JLabel jLabel_Modificar_RL;
    private javax.swing.JLabel jLabel_Modificar_RP;
    private javax.swing.JLabel jLabel_Modificar_SE;
    private javax.swing.JLabel jLabel_Modificar_Seleccion;
    private javax.swing.JLabel jLabel_Modificar_TP;
    private javax.swing.JLabel jLabel_NivelA;
    private javax.swing.JLabel jLabel_NivelACV;
    private javax.swing.JLabel jLabel_NivelASE;
    private javax.swing.JLabel jLabel_NivelA_CV;
    private javax.swing.JLabel jLabel_NivelA_SE;
    private javax.swing.JLabel jLabel_NombreAP;
    private javax.swing.JLabel jLabel_NombreCV;
    private javax.swing.JLabel jLabel_NombreD;
    private javax.swing.JLabel jLabel_NombreExpLD;
    private javax.swing.JLabel jLabel_NombreM;
    private javax.swing.JLabel jLabel_NombreRL;
    private javax.swing.JLabel jLabel_NombreSEM;
    private javax.swing.JLabel jLabel_Nombre_EmpresaExpLD;
    private javax.swing.JLabel jLabel_Nombre_NivelA;
    private javax.swing.JLabel jLabel_Nombre_Puesto;
    private javax.swing.JLabel jLabel_Nombre_RP;
    private javax.swing.JLabel jLabel_PPA;
    private javax.swing.JLabel jLabel_PPAA;
    private javax.swing.JLabel jLabel_PPC;
    private javax.swing.JLabel jLabel_PPCC;
    private javax.swing.JLabel jLabel_PPS;
    private javax.swing.JLabel jLabel_PPSE;
    private javax.swing.JLabel jLabel_Pago;
    private javax.swing.JLabel jLabel_PeriodoP;
    private javax.swing.JLabel jLabel_Prueba;
    private javax.swing.JLabel jLabel_PruebaAPP;
    private javax.swing.JLabel jLabel_Prueba_APP;
    private javax.swing.JLabel jLabel_Puesto;
    private javax.swing.JLabel jLabel_PuestoSE;
    private javax.swing.JLabel jLabel_Puesto_SE;
    private javax.swing.JLabel jLabel_RL;
    private javax.swing.JLabel jLabel_RLCV;
    private javax.swing.JLabel jLabel_RL_APPS;
    private javax.swing.JLabel jLabel_RL_CV;
    private javax.swing.JLabel jLabel_RPCV;
    private javax.swing.JLabel jLabel_RP_CV;
    private javax.swing.JLabel jLabel_RRHH;
    private javax.swing.JLabel jLabel_RangoEdadM;
    private javax.swing.JLabel jLabel_RangoEdadMa;
    private javax.swing.JLabel jLabel_RangoEdadMa1;
    private javax.swing.JLabel jLabel_ReferenciasP;
    private javax.swing.JLabel jLabel_RequisitosAP;
    private javax.swing.JLabel jLabel_Seleccion;
    private javax.swing.JLabel jLabel_SolicitudE;
    private javax.swing.JLabel jLabel_TA;
    private javax.swing.JLabel jLabel_TP;
    private javax.swing.JLabel jLabel_TelefonoCV;
    private javax.swing.JLabel jLabel_TelefonoRL;
    private javax.swing.JLabel jLabel_Telefono_RP;
    private javax.swing.JLabel jLabel_Tiempo_FinalizacionExpLD;
    private javax.swing.JLabel jLabel_Tiempo_InicioExpLD;
    private javax.swing.JLabel jLabel_TipoP;
    private javax.swing.JLabel jLabel_id_Nombre_EpLLD;
    private javax.swing.JPanel jPanel_MantenimientoA;
    private javax.swing.JPanel jPanel_MantenimientoAE;
    private javax.swing.JPanel jPanel_MantenimientoAP;
    private javax.swing.JPanel jPanel_MantenimientoAPP;
    private javax.swing.JPanel jPanel_MantenimientoBE;
    private javax.swing.JPanel jPanel_MantenimientoC;
    private javax.swing.JPanel jPanel_MantenimientoCV;
    private javax.swing.JPanel jPanel_MantenimientoEC;
    private javax.swing.JPanel jPanel_MantenimientoExpL;
    private javax.swing.JPanel jPanel_MantenimientoExpLD;
    private javax.swing.JPanel jPanel_MantenimientoNA;
    private javax.swing.JPanel jPanel_MantenimientoPP;
    private javax.swing.JPanel jPanel_MantenimientoRL;
    private javax.swing.JPanel jPanel_MantenimientoS;
    private javax.swing.JPanel jPanel_MantenimientoSE;
    private javax.swing.JPanel jPanel_Mantenimiento_Medio;
    private javax.swing.JPanel jPanel_MantenimientosP;
    private javax.swing.JPanel jPanel_MantenimientosRP;
    private javax.swing.JPanel jPanel_MatenimientosD;
    private javax.swing.JPanel jPanel_RRHH;
    private javax.swing.JPanel jPanel_Tipo_Prueba;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JTextArea jTextArea_DescripcionA;
    private javax.swing.JTextArea jTextArea_DescripcionM;
    private javax.swing.JTextArea jTextArea_DescripcionSE;
    private javax.swing.JTextField jTextField_Encontraid;
    private javax.swing.JTable tbl_A;
    private javax.swing.JTable tbl_AE;
    private javax.swing.JTable tbl_AP;
    private javax.swing.JTable tbl_APP;
    private javax.swing.JTable tbl_BE;
    private javax.swing.JTable tbl_C;
    private javax.swing.JTable tbl_CV;
    private javax.swing.JTable tbl_Departamento;
    private javax.swing.JTable tbl_EC;
    private javax.swing.JTable tbl_ExpL;
    private javax.swing.JTable tbl_ExpLD;
    private javax.swing.JTable tbl_Medio;
    private javax.swing.JTable tbl_NivelA;
    private javax.swing.JTable tbl_PP;
    private javax.swing.JTable tbl_Puesto;
    private javax.swing.JTable tbl_RL;
    private javax.swing.JTable tbl_RP;
    private javax.swing.JTable tbl_S;
    private javax.swing.JTable tbl_SE;
    private javax.swing.JTable tbl_TP;
    private javax.swing.JTextField txt_ApellidoCV;
    private javax.swing.JTextField txt_AplicacionAPP;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_BuscarA;
    private javax.swing.JTextField txt_BuscarAE;
    private javax.swing.JTextField txt_BuscarAP;
    private javax.swing.JTextField txt_BuscarEC;
    private javax.swing.JTextField txt_BuscarM;
    private javax.swing.JTextField txt_BuscarPP;
    private javax.swing.JTextField txt_BuscarRL;
    private javax.swing.JTextField txt_BuscarS;
    private javax.swing.JTextField txt_BuscarTP;
    private javax.swing.JTextField txt_Buscar_APP;
    private javax.swing.JTextField txt_Buscar_BE;
    private javax.swing.JTextField txt_Buscar_C;
    private javax.swing.JTextField txt_Buscar_CV;
    private javax.swing.JTextField txt_Buscar_ExpL;
    private javax.swing.JTextField txt_Buscar_ExpLD;
    private javax.swing.JTextField txt_Buscar_NivelA;
    private javax.swing.JTextField txt_Buscar_Puesto;
    private javax.swing.JTextField txt_Buscar_RP;
    private javax.swing.JTextField txt_Buscar_SE;
    private javax.swing.JTextField txt_CorreoCV;
    private javax.swing.JTextField txt_DC;
    private javax.swing.JTextField txt_DPICV;
    private javax.swing.JTextField txt_Descripcion_NivelA;
    private javax.swing.JTextArea txt_Descripcion_Puesto;
    private javax.swing.JTextField txt_DireccionCV;
    private javax.swing.JTextField txt_EC;
    private javax.swing.JTextField txt_EdadCV;
    private javax.swing.JTextField txt_EstatusS;
    private javax.swing.JTextField txt_Estatus_Departamento;
    private javax.swing.JTextField txt_Estatus_Puesto;
    private javax.swing.JTextField txt_FC;
    private javax.swing.JTextField txt_Genero;
    private javax.swing.JTextField txt_GeneroCV;
    private javax.swing.JTextField txt_NombreCV;
    private javax.swing.JTextField txt_NombreExpLD;
    private javax.swing.JTextField txt_NombreM;
    private javax.swing.JTextField txt_NombreRL;
    private javax.swing.JTextField txt_Nombre_Departamento;
    private javax.swing.JTextField txt_Nombre_EmpresaExpLD;
    private javax.swing.JTextField txt_Nombre_NivelA;
    private javax.swing.JTextField txt_Nombre_Puesto;
    private javax.swing.JTextField txt_Nombre_RP;
    private javax.swing.JTextField txt_RangoEdadM;
    private javax.swing.JTextField txt_RangoEdadMa;
    private javax.swing.JTextField txt_RequisitosAP;
    private javax.swing.JTextField txt_SEC;
    private javax.swing.JTextField txt_TA;
    private javax.swing.JTextField txt_TP;
    private javax.swing.JTextField txt_TelefonoCV;
    private javax.swing.JTextField txt_TelefonoRL;
    private javax.swing.JTextField txt_Telefono_RP;
    private javax.swing.JTextField txt_Tiempo_FinalizacionExpLD;
    private javax.swing.JTextField txt_Tiempo_InicioExpLD;
    private javax.swing.JTextField txt_ap;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_depa;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_idS;
    private javax.swing.JTextField txt_id_A;
    private javax.swing.JTextField txt_id_AP;
    private javax.swing.JTextField txt_id_APP;
    private javax.swing.JTextField txt_id_C;
    private javax.swing.JTextField txt_id_Departamento;
    private javax.swing.JTextField txt_id_EC;
    private javax.swing.JTextField txt_id_ExpL;
    private javax.swing.JTextField txt_id_ExpLD;
    private javax.swing.JTextField txt_id_FF;
    private javax.swing.JTextField txt_id_FI;
    private javax.swing.JTextField txt_id_Medio;
    private javax.swing.JTextField txt_id_NivelA;
    private javax.swing.JTextField txt_id_PP;
    private javax.swing.JTextField txt_id_Pago;
    private javax.swing.JTextField txt_id_Puesto;
    private javax.swing.JTextField txt_id_RP;
    private javax.swing.JTextField txt_id_ReferenciaL;
    private javax.swing.JTextField txt_id_SolicitudE;
    private javax.swing.JTextField txt_id_TP;
    private javax.swing.JTextField txt_idap;
    private javax.swing.JTextField txt_peri;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_selec;
    // End of variables declaration//GEN-END:variables
}
