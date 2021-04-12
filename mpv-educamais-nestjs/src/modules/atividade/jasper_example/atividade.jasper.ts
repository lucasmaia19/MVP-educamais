

var express = require('express'),
    
    app = express(),
    
    jasper = require('node-jasper')({
        path: 'lib/jasperreports-5.6.0',
        reports: {
            hw: {
                // jasper: 'reports/helloWorld.jasper'
                jrxml: '/report/atividade-pdf.jrxml'
            }
        },
        drivers: {
            pg: {
                // path: 'lib/postgresql-9.2-1004.jdbc41.jar',
                // class: 'org.postgresql.Driver',
                // type: 'postgresql'
                path: 'lib/postgresql-9.2-1004.jdbc41.jar',
                class: 'com.mysql.jdbc.Driver',
                type: 'mysql'
            }
        },
        conns: {
            dbserver1: {
                // host: 'dbserver1.example.com',
                // port: 5432,
                // dbname: 'example',
                // user: 'johnny',
                // pass: 'test',
                // driver: 'pg'
                host: '127.0.0.1',
                port: 3306,
                dbname: 'mvp_educamais_nestjs',
                user: 'root',
                pass: 'root',
                driver: 'pg'
            }
        }
        // defaultConn: 'dbserver1'
    })

    app.get('/pdf', function(req, res, next) {
        //beware of the datatype of your parameter.
        var report = {
            report: 'hw',
            data: {
                id: parseInt(req.query.id, 10)
                secundaryDataset: jasper.toJsonDataSource({
                    data: ...
                },'data')
            }
            dataset: //main dataset
        };
        var pdf = jasper.pdf(report);
        res.set({
            'Content-type': 'application/pdf',
            'Content-Length': pdf.length
        });
        res.send(pdf);
    });

    // app.listen(3000);