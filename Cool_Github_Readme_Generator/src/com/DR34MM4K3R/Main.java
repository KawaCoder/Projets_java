package com.DR34MM4K3R;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String reponse = "";
        String reponse1 = "";


        boolean tempboolean=false;

        String repolink;
        String title;
        String license;
        String tableofcontent;
        String typeofprogram;
        String abouttext;
        String linuxdl;
        String windowsdl;
        String macdl;
        String universaldl;
        String howtousetext;
        String howtoruntext;
        StringBuilder bugs;



        while(true){
            title="";
            license="";
            repolink="";
            linuxdl="";
            windowsdl="";
            macdl="";
            universaldl="";
            abouttext="";
            howtousetext="";
            howtoruntext="";
            bugs = new StringBuilder();




            System.out.print("Complete the link of your repo. Exemple: DR34M-M4K3R/GhostRecon\n https://github.com/");
            repolink="https://github.com/"+sc.nextLine();
            System.out.println(repolink);





            typeofprogramchoice:
            while(true){
                System.out.println("Enter the displayed type of your program:" +
                        "\n-[1] Program" +
                        "\n-[2] Game" +
                        "\n-[3] Tool" +
                        "\n-[4] Software" +
                        "\n-[5] Script");
                reponse=sc.nextLine();
                switch (reponse) {
                    case "1":
                        typeofprogram="Program";
                        break typeofprogramchoice;
                    case "2":
                        typeofprogram="Game";
                        break typeofprogramchoice;
                    case "3":
                        typeofprogram="Tool";
                        break typeofprogramchoice;
                    case "4":
                        typeofprogram="Software";
                        break typeofprogramchoice;
                    case "5":
                        typeofprogram="Script";
                        break typeofprogramchoice;
                    default:
                        System.out.println("--  Enter the number corresponding to your choice. --\n");
                        break;
                }
            }



            System.out.println("Enter the displayed title of your program:");
            title=sc.nextLine();



            System.out.println("Add a license badge among those:" +

                    "-[1] Apache License 2.0\n" +
                    "-[2] BSD 3-Clause \"New\" or \"Revised\" license\n" +
                    "-[3] BSD 2-Clause \"Simplified\" or \"FreeBSD\" license\n" +
                    "-[4] GNU General Public License 3 (GPL 3.0)\n" +
                    "-[5] GNU Library or \"Lesser\" General Public License (LGPL)\n" +
                    "-[6] MIT license\n" +
                    "-[7] Mozilla Public License 2.0\n" +
                    "-[8] Common Development and Distribution License\n" +
                    "-[9] Eclipse Public License version 2.0\n\n" +
                    "          [10] : NO LICENSE BADGE\n");

            licencechoice:
            while(true){
                reponse = sc.nextLine();
                switch (reponse) {
                    case "1":
                        license = "[![License: Apache License 2.0](https://img.shields.io/badge/License-Apache%20License%202.0-c00747.svg?style=for-the-badge&logo=apache)](https://www.apache.org/licenses/LICENSE-2.0)";
                        break licencechoice;
                    case "2":
                        license = "[![License: 3-Clause BSD License](https://img.shields.io/badge/License-3%20Clause%20BSD%20License-red.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QA/wD/AP+gvaeTAAAC3UlEQVQ4jYWTXUhUeRjGnzPH5sz5n3P+ODPEhJASiEIEIghW5hDTzkVddBFEd10Kg1ciUV4t4UUbdVF2E60uZOWyFQS7SzOYkGBy+oA+ZIiRMWvROe44M2TqOON8+HSlrLXuPtfP7+Hlfd8H+F6NmqZd8fv974UQS0KIJb/fH3e73T8B2Pcv/i3VmKZ5w+PxFCORyHosFmMikWAikWA0GmVXV9e6pmlFwzCuAFC/g6WUYx0dHauO43Anzc3Nsa2tbVVK+XhbiGVZN4PBYL5UKu0Ib6pYLLK9vX3VNM1rm3yTaZqFbDbLiUiEd+vrmU+lWC2X+fLCBcYHBsiNDX548IAvzp/n6vw8FxYWKIQoANinCiF+7O7uPrg/n3clhoZQWV7G9O3bWHMcpMbG8PezZ9hz+DAmIhFslMt43d+P/WfOYIXE1NRUFbW1tZ9s2+bvR4/y+blz/JJMckgI/hkK0Xn6dGv0hy0tJMmPjx7xj2PHOD4+Tq/Xm4SmaYVsNsu7dXUc1DTeUlUOBwJ8d/Uqf21sZC4e3xZAkg9bW+k4Dj0ez0oNSUVRFLh9Pii7dsFtWSitrGDv8eMoLS/jcTiMH+7f33YyRVHgcrlAUqnRdX1xdnZ2754jRxA4dAhNZ8/iZV8f5qJRtF28CKOuDvHr17fgpelpKKqKmZkZ6LqeVlVVbfb5fK0NmYxrLZXCl2QSMyMjcHu9SN65g8VXr2A1NGD+yRPk3rzB20uX0H75MoZHR8u2bd8DgANSynzs9Gn+1tzMe/X1HD11ikvJJGMnTzJ64gTXP3/m8O7dHA4EmBgcZCaToWEYeQBNm4/0czgczler1f99pEqlws7OzrxpmgP/3ItbSvkiFAqt5XK5HeFMJsNgMLhmWdYEgJpv+6BJKUcMwyj09vZWbNtmOp1mOp3m5OQke3p6KkKIgmVZvwBw/1crW3RdvyGl/EtV1bKqqiUp5Udd168BOPCt+StmWtqyjBtO4AAAAABJRU5ErkJggg==)](https://opensource.org/licenses/BSD-3-Clause)";
                        break licencechoice;
                    case "3":
                        license = "[![License: 2-Clause BSD License](https://img.shields.io/badge/License-2%20Clause%20BSD%20License-red.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QA/wD/AP+gvaeTAAAC3UlEQVQ4jYWTXUhUeRjGnzPH5sz5n3P+ODPEhJASiEIEIghW5hDTzkVddBFEd10Kg1ciUV4t4UUbdVF2E60uZOWyFQS7SzOYkGBy+oA+ZIiRMWvROe44M2TqOON8+HSlrLXuPtfP7+Hlfd8H+F6NmqZd8fv974UQS0KIJb/fH3e73T8B2Pcv/i3VmKZ5w+PxFCORyHosFmMikWAikWA0GmVXV9e6pmlFwzCuAFC/g6WUYx0dHauO43Anzc3Nsa2tbVVK+XhbiGVZN4PBYL5UKu0Ib6pYLLK9vX3VNM1rm3yTaZqFbDbLiUiEd+vrmU+lWC2X+fLCBcYHBsiNDX548IAvzp/n6vw8FxYWKIQoANinCiF+7O7uPrg/n3clhoZQWV7G9O3bWHMcpMbG8PezZ9hz+DAmIhFslMt43d+P/WfOYIXE1NRUFbW1tZ9s2+bvR4/y+blz/JJMckgI/hkK0Xn6dGv0hy0tJMmPjx7xj2PHOD4+Tq/Xm4SmaYVsNsu7dXUc1DTeUlUOBwJ8d/Uqf21sZC4e3xZAkg9bW+k4Dj0ez0oNSUVRFLh9Pii7dsFtWSitrGDv8eMoLS/jcTiMH+7f33YyRVHgcrlAUqnRdX1xdnZ2754jRxA4dAhNZ8/iZV8f5qJRtF28CKOuDvHr17fgpelpKKqKmZkZ6LqeVlVVbfb5fK0NmYxrLZXCl2QSMyMjcHu9SN65g8VXr2A1NGD+yRPk3rzB20uX0H75MoZHR8u2bd8DgANSynzs9Gn+1tzMe/X1HD11ikvJJGMnTzJ64gTXP3/m8O7dHA4EmBgcZCaToWEYeQBNm4/0czgczler1f99pEqlws7OzrxpmgP/3ItbSvkiFAqt5XK5HeFMJsNgMLhmWdYEgJpv+6BJKUcMwyj09vZWbNtmOp1mOp3m5OQke3p6KkKIgmVZvwBw/1crW3RdvyGl/EtV1bKqqiUp5Udd168BOPCt+StmWtqyjBtO4AAAAABJRU5ErkJggg==)](https://opensource.org/licenses/BSD-2-Clause)";
                        break licencechoice;
                    case "4":
                        license = "[![License: GPL 3.0](https://img.shields.io/badge/License-(GNU)%20GPL%203.0-red.svg?style=for-the-badge&logo=GNU)](https://www.gnu.org/licenses/gpl-3.0.html)\n";
                        break licencechoice;
                    case "5":
                        license = "[![License: LGPL 3.0](https://img.shields.io/badge/License-(GNU)%20LGPL%203.0-green.svg?style=for-the-badge&logo=GNU)](https://www.gnu.org/licenses/lgpl-3.0.en.html)\n";
                        break licencechoice;
                    case "6":
                        license = "[![License: MIT](https://img.shields.io/badge/License-MIT-red.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAYCAYAAACbU/80AAAC90lEQVRIie2WXW8UVRzGn3N226FNq8RSElCM8TuYeMMX4EbDBR+ICxICpoYEFqk11rS7nZfdLhBuNCEKxHjFpQmGFnUxSI3G1rS7O505Py929iVltt0aDF44yT+Z8/6b//Occ0aRRPAKQ4GEL0skHSoCiRXTL6/K4mfvS4XRxvcAKkYc5klx+BLLxvbqnIMwg3IuPXCOi7Mn/6MALRJIUlrNmJRdAJLEQZKCizuLwVCASAbXjjv9kxSXjQHYgV79+bfeHpIBFxNIRLK0s6pqppfrdtkHwJfwZXoaO9efOhzQPhzqgR5A8QWAXpd9APa6nCEAw034P8CrBAjeO81q1pAHEEncO3Pu0ADpxhPKVlSMyQcIZViYGIdv7pK0/spOtJwM7PzGL+EyC94UwYgAC+MzzJ18B3a2WBmaASuqErv37pMmDM1AE2hU672jdBSAmxKl2VkSYMUeIMHS+6d7DXkAgcSXH545vATPn+5/GYUSNVnir++Caw6XIHU0aj412ZEz4Mvw8bFZ2tnxnQvQjbQewNoTfIl5T/B0HRpr3OwC/Pwjv1+/PjC5oNHpw/pPuQsEEteOvgGNdW4dBND1w2A5lHLN87LiBQB/z4Ju+9d+agfgyrZ/r3fv+EEJfNN/ryp/C+YC7P3iR/PX8CVKxoNnz6gXRNUIGmt89OYJQonHizdoPnzI1VPv4kt8f+ECf353n1WJyAoaG1z1pg/2wF6AUILWFqHE5eOnqBQ8Hl26wiYpkTF8+vpxykakSYuK8XBxkyVjmdc4dYnPxi1pEyIZzh+ZojJW/OcAkZnsy9KGkjxuSCxKkHZ2CrstKipSm/AgjvnktWnS9jYleZQ0Qa0wAkAgMTd5jLnJGS5PzUC83QFJYspj0/wQLOGePyYoHGHj2wedM2QAYLEwwUXvKF/YMb764Cxuc4sVGfhjk9ujSPD5mPBt30R31NnLXdOVbee3qyqxbA2+xK0sW3WJsjHUJMqmSFkey9lci0Wbb8LKv7S9Ro2/AYdeBW+rWK46AAAAAElFTkSuQmCC)](https://mit-license.org/)\n";
                        break licencechoice;
                    case "7":
                        license = "[![License: MPL 2.0](https://img.shields.io/badge/License-MPL%202.0-orange.svg?style=for-the-badge&logo=mozilla)](https://www.mozilla.org/en-US/MPL/)\n\n";
                        break licencechoice;
                    case "8":
                        license = "[![License: CDDL](https://img.shields.io/badge/License-CDDL-green.svg?style=for-the-badge)](https://opensource.org/licenses/CDDL-1.0)\n";
                        break licencechoice;
                    case "9":
                        license = "[![License: EPL 2.0](https://img.shields.io/badge/License-EPL%202.0-blue.svg?style=for-the-badge&logo=eclipse)](https://www.eclipse.org/legal/epl-2.0/)\n\n";
                        break licencechoice;
                    case "10":
                        break licencechoice;
                    default:
                        System.out.println("--  Enter the number corresponding to your choice. Type \"10\" if you don't want to add a license badge. --\n");
                        break;
                }
            }



            tableofcontent="## Table of content:<br/>\n" +
                    "### 1. [Downloads]("+repolink+"#downloads)<br/>\n" +
                    "### 2. [About the "+typeofprogram+"]("+repolink+"#about-the-program)<br/>\n" +
                    "### 3. [How to run the "+typeofprogram+"?]("+repolink+"#run-the-"+typeofprogram+")<br/>\n" +
                    "### 4. [How to use "+title+"?]("+repolink+"#how-to-use-"+title.replace(' ', '-')+")<br/>\n" +
                    "### 5. [Troubleshoot]("+repolink+"#Troubleshoot)<br/>\n";





            howtoruntext="\nDouble click on the main file.";
            releasechoice:
            while(true){
                reponse="";
                System.out.println("Add a download badge for:" +
                        "\n[1] Linux" +
                        "\n[2] Windows (.exe/.bat/.cmd)" +
                        "\n[3] Mac (.app)" +
                        "\n[4] Single universal release(.py, .jar, .html, ...)" +
                        "\n\n        [5] Finished");
                reponse=sc.nextLine();
                switch (reponse) {
                    case "1":
                        System.out.println("Enter the direct download link to the linux release");
                        linuxdl = "\n[![linux download badge](https://img.shields.io/badge/Download-for%20Linux-181717?style=for-the-badge&color=yellow&logo=linux)]("+sc.nextLine()+")<br>";
                        break;
                    case "2":
                        System.out.println("Enter the direct download link to the windows release ");
                        windowsdl = "\n[![windows download badge](https://img.shields.io/badge/Download%20.exe-181717?style=for-the-badge&color=blue&logo=windows)]("+sc.nextLine()+")<br>";
                        break;
                    case "3":
                        System.out.println("Enter the direct download link to the mac release");
                        macdl="\n[![mac download badge](https://img.shields.io/badge/Download%20for%20Mac-181717?style=for-the-badge&color=black&logo=apple)]("+sc.nextLine()+")<br>";
                        break;
                    case "4":
                        System.out.println("Enter the direct download link to the release");
                        universaldl = sc.nextLine();

                        if (universaldl.contains(".py")){

                            howtoruntext="\n\n<br>\n\n### How to run the .py file?\nTo launch the .py file, you need to open a terminal and type:\n" +
                                    "```\n" +
                                    "$ python [file].py\n" +
                                    "```\n"+
                                    "Of course, you need [python](python.org)";

                            universaldl="\n[![python download badge](https://img.shields.io/badge/Download-.py-181717?style=for-the-badge&color=blue&logo=python)](\"+sc.nextLine()+\")<br>";


                        }else if (universaldl.contains(".jar")){

                            howtoruntext="\n\n<br>\n\n### How to run the .jar file?\nTo launch the .jar file, you need to open a terminal and type:\n" +
                                    "```\n" +
                                    "$ java -jar [file].jar\n" +
                                    "```\n"+
                                    "Of course, you need [java](java.com)";

                            universaldl="\n[![java download badge](https://img.shields.io/badge/Download%20.jar-181717?style=for-the-badge&color=red&logo=java)](https://github.com/DR34M-M4K3R/Anti-AFK-kick-for-all-games/raw/main/Anti-AFK.jar)<br>\n";

                        }else{

                            universaldl="\n[![download badge](https://img.shields.io/badge/Download%20"+title.replace(" ", "%20")+"-now-181717?style=for-the-badge&color=black)]("+sc.nextLine()+")<br>";

                        }
                        break releasechoice;



                    case "5":
                        break releasechoice;
                    default:

                        System.out.println("--  Enter the number corresponding to your choice. --\n");
                        break;
                }
            }




            System.out.println("Enter the content of the \"About\" section:");
            abouttext="\n<br>"+sc.nextLine();

            System.out.println("Enter the content of the \"How to use "+title+"?\" section:");
            howtousetext=sc.nextLine();



            while (true) {
                System.out.println("Does your " + typeofprogram + " has any common error or bug? (\"yes\" or \"no\") (to make a troubleshoot section)");
                reponse = sc.nextLine();

                if (reponse.equals("yes")) {
                    while(true){
                        System.out.println("How many bugs is there?");
                        reponse1=sc.nextLine();
                        try {
                            System.out.println(reponse1);
                            for (int i = 0; i < Integer.parseInt(reponse1); i++) {
                                System.out.println("Add bug title:");
                                bugs.append("\n\n### ").append(sc.nextLine());
                                System.out.println("Add bug description:");
                                bugs.append("\n\n#### Description:\n").append(sc.nextLine());
                                System.out.println("How to resolve the bug?:");
                                bugs.append("\n\n#### How to solve?:\n").append(sc.nextLine());
                            }
                            System.out.println(bugs);
                            break;
                        }catch(Exception e){

                            System.out.println("Enter the number of bugs/errors");

                        }
                    }


                }else if (reponse.equals("no")){
                    bugs.append("### There is no current discovered/reported errors or bugs.");
                    break;

                }else{

                    System.out.println("\"yes\" or \"no\"?");

                }

            }





            try {
                BufferedWriter f_writer
                        = new BufferedWriter(new FileWriter(
                        "README.md"));

                f_writer.write("# "+title+"\n");

                f_writer.write(license+"\n");

                f_writer.write(tableofcontent);

                f_writer.write("## Downloads<br>\n");

                f_writer.write(linuxdl+windowsdl+macdl+universaldl);

                f_writer.write("\n<br>\n\n## About the "+typeofprogram+"");

                f_writer.write(abouttext+"\n");

                f_writer.write("\n<br>\n\n## How to run the "+typeofprogram+"?");

                f_writer.write(howtoruntext+"\n");

                f_writer.write("\n<br>\n\n## How to use "+title+"?");

                f_writer.write("\n\n"+howtousetext+"\n\n\n");

                f_writer.write("\n\n## Troubleshoot\n\n");

                f_writer.write(String.valueOf(bugs));

                System.out.print("Content successfully written in the file.");

                f_writer.write("\n<br><br><br>You like this readme? I made it with [this tool]() coded by [DR34M-M4K3R](https://github.com/DR34M-M4K3R)");

                f_writer.close();

            }catch (IOException e) {

                System.out.print(e.getMessage());
            }





        }


    }
}
