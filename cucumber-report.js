const report = require('/Users/Paolo/Documents/REPO/multiple-cucumber-html-reporter/lib/generate-report');

report.generate({
    saveCollectedJSON: true,
    jsonDir: '/tmp/webReport/',
    reportPath: '/Users/Paolo/Documents/REPO/multiple-cucumber-html-reporter/.tmp/joyWeb/',
    reportName: 'Report: Joy Web',
    customMetadata: false,
    displayDuration: true,
    customData: {
        title: 'Run info',
        data: [
            {label: 'Project', value: 'Joy Web'},
            {label: 'Release', value: 'REL'},
            {label: 'Backend', value: 'digital-api-2.8.0.war'},
            {label: 'Frontend', value: 'dist-1.5.17'},
            {label: 'Cycle', value: 'B11221.34321'},
            {label: 'Execution Start Time', value: 'XYZ'},
            {label: 'Execution End Time', value: (new Date).toISOString().replace(/T/, ' ').replace(/\..+/, '')}
        ]
    }
});