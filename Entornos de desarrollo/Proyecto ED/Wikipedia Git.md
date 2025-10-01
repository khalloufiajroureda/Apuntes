
## Introducción Avanzada a Git 

<p align="center">
  <img src= https://i0.wp.com/unaaldia.hispasec.com/wp-content/uploads/2018/06/877f2-git-logo.png?ssl=1="Ejemplos de CMS" width="250"/>
  <br>
</p>

- [Introducción Avanzada a Git](#introducción-avanzada-a-git)
  - [**1. ¿Qué es Git?**](#1-qué-es-git)
  - [**2. Instalación y Configuración Avanzada de Git**](#2-instalación-y-configuración-avanzada-de-git)
  - [**2.1. Instalación de Git en Distintos Sistemas Operativos**](#21-instalación-de-git-en-distintos-sistemas-operativos)
  - [**2.1.1. Instalación de Git en Linux**](#211-instalación-de-git-en-linux)
  - [**2.1.2. Instalación de Git en Windows**](#212-instalación-de-git-en-windows)
  - [**2.2. Configuración Inicial de Git: Asociación de Nombre y Correo Electrónico**](#22-configuración-inicial-de-git-asociación-de-nombre-y-correo-electrónico)
  - [**2.3. Verificación de la Instalación y Configuración Correcta**](#23-verificación-de-la-instalación-y-configuración-correcta)
    - [**2.3.1. Verificación de la instalación de Git**](#231-verificación-de-la-instalación-de-git)
    - [**2.3.2. Verificación de la configuración de usuario**](#232-verificación-de-la-configuración-de-usuario)
  - [**3. Crear un Repositorio Local**](#3-crear-un-repositorio-local)
    - [**Pasos para crear un repositorio local**](#pasos-para-crear-un-repositorio-local)
    - [**3.1. Inicializar un repositorio:**](#31-inicializar-un-repositorio)
    - [**3.2. Hacer un commit (confirmar cambios):**](#32-hacer-un-commit-confirmar-cambios)
  - [**3.3. Seguimiento de Cambios con "git status" y "git log"**](#33-seguimiento-de-cambios-con-git-status-y-git-log)
    - [**3.3.1 Ver el estado actual del repositorio con git "status"**](#331-ver-el-estado-actual-del-repositorio-con-git-status)
    - [**3.3.2. Ver el historial de commits con "git log"**](#332-ver-el-historial-de-commits-con-git-log)


### **1. ¿Qué es Git?**

Git es un **sistema de control de versiones distribuido** que permite a los desarrolladores gestionar y seguir los cambios en el código de forma eficiente. A diferencia de sistemas centralizados, cada colaborador tiene una copia completa del repositorio, lo que ofrece mayor autonomía y seguridad.

**Características principales:**

- **Control de versiones local y distribuido**: cada colaborador tiene una copia completa del repositorio.
-  **Seguimiento detallado de cambios**: premite registrar cada modificacion realizada (Quien la hizo, cuándo y por qué)
-  **Fusión de ramas (branching)**: los desarrolladores pueden trabajar en características nuevas, y luego fusionarlas de manera controlada.

### **2. Instalación y Configuración Avanzada de Git**

### **2.1. Instalación de Git en Distintos Sistemas Operativos**

Git es una herramienta compatible con los principales sistemas operativos, incluidos Linux, macOS y Windows.

### **2.1.1. Instalación de Git en Linux**

Sigue los siguientes pasos para instalarlo:

```bash
sudo apt update
sudo apt install git
```

Para otras distribuciones como **Fedora** o **CentOS**, el comando sería:

- **Fedora:**

  ```bash
  sudo dnf install git
  ```

- **CentOS:**

  ```bash
  sudo yum install git
  ```

### **2.1.2. Instalación de Git en Windows**

En **Windows**, Git se instala utilizando un instalador gráfico. Puedes descargar el instalador desde la [página oficial de Git](https://git-scm.com/download/win). 

**Pasos para la instalación en Windows**:

1. Descarga el archivo `.exe` desde el sitio web.
2. Ejecuta el instalador y sigue las instrucciones, seleccionando las opciones predeterminadas.
3. Tras la instalación, podrás utilizar Git tanto desde la **terminal Git Bash** como desde la **línea de comandos (CMD)** de Windows.

### **2.2. Configuración Inicial de Git: Asociación de Nombre y Correo Electrónico**

Después de instalar Git, es fundamental configurarlo para que Git pueda asociar cada cambio que realices (commits) con tu identidad.

Los dos parámetros básicos que debes configurar son tu **nombre** y tu **correo electrónico**. Ambos se incluirán en cada commit que realices.


```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```

- La opción `--global` se asegura de que esta configuración sea válida para todos los proyectos en los que trabajes en esa máquina.

### **2.3. Verificación de la Instalación y Configuración Correcta**


Una vez que Git está instalado y configurado, es importante asegurarse de que todo esté funcionando correctamente.

#### **2.3.1. Verificación de la instalación de Git**

Para confirmar que Git se ha instalado correctamente:

```bash
git --version
```
Esto debería devolver el número de versión de Git instalado. Por ejemplo:

```bash
git version 2.38.1
```
#### **2.3.2. Verificación de la configuración de usuario**

Para comprobar que tu nombre y correo electrónico han sido configurados correctamente:

```bash
git config --list
```
Este comando mostrará todas las configuraciones globales y locales activas:

```bash
user.name = Reda Khalloufi Ajrou
user.email = redakhalloufiajrou@gmail.com
```

### **3. Crear un Repositorio Local**

#### **Pasos para crear un repositorio local**

1. Navega a la carpeta que contiene tu proyecto o crea una nueva carpeta.
2. Ejecuta el siguiente comando:

```bash
git init
```
#### **3.1. Inicializar un repositorio:**

l comando `git init` inicializa un repositorio en tu directorio actual, como ya hemos visto:

```bash
git init
```

#### **3.2. Hacer un commit (confirmar cambios):**

```bash
git commit -m "Descripción del cambio"
```

**Ejemplo**:

```bash
git add index.html
git commit -m "Modificar el diseño del encabezado en index.html"
```

### **3.3. Seguimiento de Cambios con "git status" y "git log"**

Una parte crucial del trabajo con Git es el seguimiento de los cambios y el estado del repositorio. Git proporciona dos comandos fundamentales para esto: `git status` y `git log`.

#### **3.3.1 Ver el estado actual del repositorio con git "status"**

```bash
git status
```
#### **3.3.2. Ver el historial de commits con "git log"**

```bash
git log
```
También puedes agregar opciones para personalizar la salida, como `git log --oneline` para ver cada commit en una sola línea, o `git log --graph` para visualizar un gráfico de las ramas del proyecto.