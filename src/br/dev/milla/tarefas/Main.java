package br.dev.milla.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.milla.tarefas.dao.FuncionarioDAO;
import br.dev.milla.tarefas.model.Funcionario;
import br.dev.milla.tarefas.model.Tarefa;
import br.dev.milla.tarefas.ui.FrameFuncionario;
import br.dev.milla.tarefas.ui.FrameListaFuncionario;
import br.dev.milla.tarefas.utils.Utils;

public class Main {

	private static String path = "C:\\Users\\25133008\\tarefa\\tarefas.txt";

	public static void main(String[] args) {
		
		new FrameListaFuncionario();
		
//		new FrameFuncionario();

	}

	private static void gravarArquivo() {

		FileWriter arquivo = null;
		BufferedWriter escritor = null;

		try {

			arquivo = new FileWriter(path, true);
			escritor = new BufferedWriter(arquivo);

			escritor.write("Essa é uma outra mais uma nova linha!!!!, por enquanto\n");
			escritor.flush();

		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

	}

	private static void lerArquivo() {

		// Abrir o arquivo para leitura
		FileReader file = null;
		BufferedReader buffer = null;
		try {
			file = new FileReader(path);
			buffer = new BufferedReader(file);

			String linha = buffer.readLine();

			while (linha != null) {
				linha = buffer.readLine();
				if (linha != null) {
					System.out.println(linha);
				}

			}

		} catch (FileNotFoundException erro) {
			System.out.println("Arquivo não achado!");
			System.out.println(erro.getMessage());
		} catch (IOException erro) {
			System.out.println("Você não pode ver o arquivo!");
			System.out.println(erro.getMessage());
		} catch (Exception erro) {
			System.out.println("Erro genérico!");
			System.out.println(erro.getMessage());
		}
	}

}
