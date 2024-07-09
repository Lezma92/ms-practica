# Servicio REST para Generación de Hash de Folio

Este proyecto Spring Boot implementa un servicio REST que genera un hash a partir de un folio proporcionado y la fecha/hora actual en un formato específico.

## Descripción

El servicio expone un endpoint REST para recibir un parámetro folio y calcular un hash único basado en la concatenación del folio y la fecha/hora actual en el formato ddMMyyHHmmss.

## Requisitos Previos

Antes de ejecutar este servicio, asegúrate de tener instalados los siguientes componentes:

Java JDK 17 o superior
Maven

## Configuración y Ejecución

1. **Clonar el Repositorio:**

   ```bash
   git clone https://github.com/Lezma92/ms-practica.git